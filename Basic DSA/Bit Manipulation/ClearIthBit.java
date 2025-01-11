public class ClearIthBit {
    public static void clearIthBit(int n, int pos) {
        // Create a mask with 0 at 'pos' and 1 at all other positions
        int bitMask = ~(1 << pos);

        // Clear the 'pos' bit of 'n' using bitwise AND with the mask
        n = n & bitMask;

        // Print the new value of 'n' after clearing the 'pos' bit
        System.out.println(n);
    }

    public static void main(String[] args) {
        int num = 7, pos = 1; // num = 7 (binary 111), clear the 1st bit
        clearIthBit(num, pos); // Expected output: 5 (binary 101)
    }
}
