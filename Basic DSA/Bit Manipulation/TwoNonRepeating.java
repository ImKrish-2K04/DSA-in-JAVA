public class TwoNonRepeating {

    public static void findTwoNonRepeating(int[] arr) {
        int xorResult = 0;

        // Step 1: XOR all elements in the array.
        // This removes all nums appearing twice and gives the XOR of those unique nums.
        for (int num : arr) {
            xorResult ^= num; // XOR operation cancels out duplicates.
        }

        // Step 2: Find the rightmost set bit in xorResult.
        // This bit indicates the first position where the two unique numbers differ.
        int setBit = xorResult & -xorResult; // Isolate the rightmost set bit.

        // Step 3: Initialize two variables to store the two unique numbers.
        int first = 0, second = 0;

        // Step 4: Divide numbers into two groups based on the setBit.
        for (int num : arr) {
            if ((num & setBit) == 0) {
                first ^= num; // Group 1: XOR numbers where the setBit is 0.
            } else {
                second ^= num; // Group 2: XOR numbers where the setBit is 1.
            }
        }

        // Step 5: The XOR results in `first` and `second` are the two unique numbers.
        System.out.println("First non-repeating number: " + first);
        System.out.println("Second non-repeating number: " + second);
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr = { 5, 4, 1, 4, 2, 5, 1, 8 };
        // Test case 2
        int[] arr2 = { 5, 4, 1, 4, 3, 5, 1, 9 };
        // Test case 3
        int[] arr3 = { 5, 4, 1, 4, 3, 5, 1, 12 };

        // Output results for each test case.
        findTwoNonRepeating(arr); // Should output: 2, 8
        System.out.println();
        findTwoNonRepeating(arr2); // Should output: 3, 9
        System.out.println();
        findTwoNonRepeating(arr3); // Should output: 3, 12
    }
}
