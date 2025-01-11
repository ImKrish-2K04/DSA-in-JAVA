import java.util.ArrayList;
import java.util.Collections;

// This program identifies "lonely numbers" in a list.
// A lonely number appears only once and has no immediate neighbors (num + 1 or num - 1).
public class Exercise2 {

    // Method to find lonely numbers in a sorted list
    public static ArrayList<Integer> findLonelyNumber(ArrayList<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>(); // Stores lonely numbers

        // Check if the first element is lonely
        if (nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }

        // Check if the last element is lonely
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            list.add(nums.get(nums.size() - 1));
        }

        // Check for lonely numbers in the middle of the list
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i)); // Add the lonely number to the result
            }
        }

        return list; // Return the list of lonely numbers
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); // Initialize the list

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        // Handle the case when there's only one number in the list
        if (nums.size() == 1) {
            System.out.println("The lonely number is: " + nums.get(0));
            return;
        } else {
            // Sort the list to ensure neighbors are properly aligned
            Collections.sort(nums);

            // Find and display the lonely numbers
            ArrayList<Integer> newList = findLonelyNumber(nums);
            if (newList.size() == 0) {
                System.out.println("No lonely numbers are found in the list...");
            } else {
                System.out.println("Lonely numbers are: " + newList);
            }
        }
    }
}
