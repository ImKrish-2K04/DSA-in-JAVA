import java.util.ArrayList;

// This program finds and prints the first pair of numbers in a list whose sum equals the target value.
public class Learning8_1 {

    // Prints the first pair of numbers that add up to the target sum
    public static void printPairSum(ArrayList<Integer> list, int target) {
        // Label for breaking out of the nested loops once a pair is found
        outer: for (int i = 0; i < list.size() - 1; i++) {
            int val1 = list.get(i); // First value in the pair

            for (int j = i + 1; j < list.size(); j++) {
                int val2 = list.get(j); // Second value in the pair
                int sum = val1 + val2; // Calculate their sum

                // Check if the current pair matches the target sum
                if (sum == target) {
                    System.out.println("Pair is found: [" + val1 + " , " + val2 + "]");
                    break outer; // Exit both loops as the pair is found
                }
            }
        }
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
        printPairSum(list, 5);
    }
}
