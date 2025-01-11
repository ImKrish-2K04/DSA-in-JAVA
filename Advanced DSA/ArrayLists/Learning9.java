import java.util.ArrayList;

// This program finds a pair of numbers in a sorted and rotated list whose sum equals the target value.
public class Learning9 {

    // Prints the first pair of indices whose values add up to the target sum
    public static void printPairSum(ArrayList<Integer> list, int target) {
        int bp = -1; // Dummy initialization for the breaking point (rotation point)
        int n = list.size(); // Total number of elements in the list

        // Find the actual breaking point where the rotation occurs
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get((i + 1) % n)) { // Check for the rotation point
                bp = i;
                break;
            }
        }

        int stP = (bp + 1) % n; // Start pointer initialized to the smallest element

        // Find the pair of numbers whose sum matches the target
        while (bp != stP) {
            int currentSum = list.get(bp) + list.get(stP); // Calculate the sum of the current pair

            if (currentSum == target) { // If the target sum is found, print the indices and return
                System.out.println("Target found: [" + bp + " , " + stP + "]");
                return;
            }

            // Move pointers based on the comparison of currentSum with the target
            if (currentSum < target) {
                stP = (stP + 1) % n; // Increment the start pointer cyclically
            } else {
                bp = (n + bp - 1) % n; // Decrement the breaking point cyclically
            }
        }

        // If no pair matches the target sum, print a message
        System.out.println("No matches found!");
    }

    public static void main(String[] args) {
        // Initialize the list with predefined values
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Call the function with the target sum to find the pair
        printPairSum(list, 16); // Try changing the target to observe different results
    }
}
