public class FlipIthBit {
    public static void flipIthBit(int n, int pos) {
        // Create a mask with 1 at the 'pos' bit position
        int bitMask = 1 << pos;

        // Flip the 'pos' bit of 'n' using bitwise XOR
        n = n ^ bitMask;

        // Print the new value of 'n' after flipping the 'pos' bit
        System.out.println(n);
    }

    public static void main(String[] args) {
        int num = 27, pos = 2; // num = 27 (binary 11011), flip the 2nd bit
        flipIthBit(num, pos); // Expected output: 31 (binary 11111)
    }
}
