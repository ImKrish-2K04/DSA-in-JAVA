import java.util.ArrayList;

public class Exercise3_1 {
    public static void mostFrequentNumber(ArrayList<Integer> nums, int key) {
        // Create a frequency list to count occurrences of numbers following the key
        ArrayList<Integer> frequencyList = new ArrayList<>();

        // Initialize the frequency list with 0s for indices 0 to 1000
        // Assuming the numbers in the input array are in the range [0, 1000]
        for (int i = 0; i <= 1000; i++) {
            frequencyList.add(0);
        }

        // Traverse the input list to find all numbers that follow the given key
        for (int i = 0; i < nums.size(); i++) {
            // Check if the current number is the key and if it has a next number
            if (nums.get(i) == key && i + 1 < nums.size()) {
                // The target is the number that comes immediately after the key
                int target = nums.get(i + 1);

                // Increment the count of the target in the frequency list
                frequencyList.set(target, frequencyList.get(target) + 1);
            }
        }

        // Initialize variables to track the most frequent number and its count
        int maxCount = 0; // Maximum frequency found so far
        int mostFrequent = -1; // The number with the maximum frequency

        // Traverse the frequency list to find the number with the highest count
        for (int i = 0; i < frequencyList.size(); i++) {
            // If the current frequency is greater than the maxCount, update
            if (frequencyList.get(i) > maxCount) {
                mostFrequent = i; // Update the most frequent number
                maxCount = frequencyList.get(i); // Update the maximum frequency
            }
        }

        // Print the most frequent number following the key
        System.out.println("The most frequent number following the key is: " + mostFrequent);
    }

    public static void main(String[] args) {
        // Create an ArrayList of numbers for testing
        ArrayList<Integer> nums = new ArrayList<>();

        // Add test values to the list
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        // Call the method with key = 1
        mostFrequentNumber(nums, 1);
    }
}
