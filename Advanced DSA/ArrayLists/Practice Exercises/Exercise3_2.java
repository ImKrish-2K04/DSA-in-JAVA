import java.util.*;

public class Exercise3_2 {
    // Exercise 3 of arraylist chapter,
    // using HashMap data-structure to make it more easy...

    public static void mostFrequentTarget(ArrayList<Integer> list, int key) {
        // Check if the list is empty or too short to process
        if (list.size() < 2 || list.isEmpty()) {
            System.out.println("Not a valid list to work on!");
            return; // Exit the method early
        }

        // A HashMap to store the frequency of numbers that follow the key
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        // Iterate through the list to populate the frequency map
        for (int i = 0; i < list.size() - 1; i++) {
            // Check if the current element matches the key
            if (list.get(i) == key) {
                int nextElem = list.get(i + 1); // Get the element immediately after the key
                // Update the frequency count in the map
                if (!frequencies.containsKey(nextElem)) {
                    frequencies.put(nextElem, 1); // Initialize frequency if not present
                } else {
                    frequencies.put(nextElem, frequencies.get(nextElem) + 1); // Increment frequency
                }
            }
        }

        // Find the target number with the highest frequency
        int target = -1; // Variable to store the most frequent target
        int frequency = 0; // Variable to store the highest frequency

        // Iterate over the frequency map entries
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            int k = entry.getKey(); // The target number
            int v = entry.getValue(); // The frequency of the target number

            // Update the most frequent target if the current frequency is higher
            if (frequency < v) {
                target = k;
                frequency = v;
            }
        }

        // Print the result
        System.out.println("The most frequent target following the key is: " + target);
    }

    public static void main(String[] args) {
        // Create and populate the input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        // Call the method with the list and key
        mostFrequentTarget(list, 1);
    }
}
