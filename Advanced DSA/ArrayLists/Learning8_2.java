import java.util.ArrayList;

// This program finds and prints a pair of numbers in a sorted list whose sum equals the target value using the two-pointer technique.
public class Learning8_2 {

    // Prints the first pair of numbers that add up to the target sum
    public static void printPairSum(ArrayList<Integer> list, int target) {
        int stPointer = 0; // Pointer starting from the beginning of the list
        int endPointer = list.size() - 1; // Pointer starting from the end of the list
        int sum = 0; // Variable to store the sum of the two numbers

        // Continue until the two pointers meet
        while (stPointer < endPointer) {
            sum = list.get(stPointer) + list.get(endPointer); // Calculate the sum of the current pair

            // Check if the current pair matches the target sum
            if (sum == target) {
                System.out.println("Pair found: [" + list.get(stPointer) + " , " + list.get(endPointer) + "]");
                return; // Exit from the method as the pair is found
            }

            // Adjust the pointers based on the current sum
            if (sum < target) {
                stPointer++; // Move the start pointer forward to increase the sum
            } else {
                endPointer--; // Move the end pointer backward to decrease the sum
            }
        }

        System.out.println("Sorry, but no combinations found for the given target!");
    }

    public static void main(String[] args) {
        // Initialize the list with predefined values
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Call the function with the target sum to find the pair
        printPairSum(list, 11); // try 12 here...
    }
}
