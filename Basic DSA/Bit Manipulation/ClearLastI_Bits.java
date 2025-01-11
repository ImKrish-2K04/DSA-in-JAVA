public class ClearLastI_Bits {
    // Clears the last 'pos' bits of the number 'n'
    public static void clearLastI_Bits(int n, int pos) {
        // Create a bitmask where the last 'pos' bits are 0 and all higher bits are 1
        int bitMask = ~(0) << pos;

        // Apply the bitmask to 'n' using bitwise AND to clear the last 'pos' bits
        int result = n & bitMask;

        // Print the result after clearing the bits
        System.out.println("RESULT: " + result);
    }

    public static void main(String[] args) {
        int num = 15, pos = 2; // num = 15 (binary 1111), clear the last 2 bits
        clearLastI_Bits(num, pos); // Expected output: 12 (binary 1100)
    }
}
