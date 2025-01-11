public class ClearRangeOfBits {
    // Method to clear a range of bits from position i to j in the binary
    // representation of n
    public static void clearRangeOfBits(int n, int i, int j) {
        // Create part1: Clears all bits from position (j + 1) onwards
        int part1 = (~(0) << (j + 1));

        // Create part2: Sets all bits before position i to 1
        int part2 = ((1 << i) - 1);

        // Combine part1 and part2 to create the bitmask
        // Bitmask will have 1s outside the range [i, j] and 0s within the range
        int bitMask = part1 | part2;

        // Apply the bitmask to clear the range of bits in n
        int result = n & bitMask;

        // Print the final result after clearing the range
        System.out.println("RESULT: " + result);
    }

    public static void main(String[] args) {
        // Example inputs
        int num = 37785; // Original number in binary: 1001001110011001
        int i = 3, j = 9; // Clear bits from position 3 to 9 (inclusive)

        // Call the method with the example inputs
        clearRangeOfBits(num, i, j);
    }
}
