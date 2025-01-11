public class GetIthBit {

    // Function to get the i-th bit of a number 'n'
    public static int getIthBit(int n, int i) {
        // Right shift 'n' by 'i' positions
        // to bring the desired bit to the least significant position.
        // Perform bitwise AND with 1 to isolate the bit.
        int bit = (n >> i) & 1;
        return bit; // Return the isolated bit (0 or 1).
    }

    public static void main(String[] args) {
        int num = 10; // Input number (binary representation: 1010).
        int pos = 2; // Position of the bit to extract (0-indexed, from right to left).

        // Output the result of extracting the bit at position 'pos' from 'num'.
        // In this case, the 2nd bit of 1010 (from right) is 1.
        System.out.println(getIthBit(num, pos)); // Expected output: 1
    }
}
