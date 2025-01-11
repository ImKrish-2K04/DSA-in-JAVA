public class SetIthBit {
    // Method to set the i-th bit of the number 'n' at position 'pos'
    public static void setIthBit(int n, int pos) {
        // Create a bitmask by shifting 1 to the left by 'pos' positions
        int bitMask = 1 << pos;

        // Use bitwise OR to set the bit at position 'pos' to 1
        n = n | bitMask;

        // Print the modified number after setting the bit
        System.out.println(n);
    }

    public static void main(String[] args) {
        // Test with num = 10 (binary: 1010) and pos = 2
        int num = 10, pos = 2;

        // Call method to set the bit at position 'pos' and print result
        setIthBit(num, pos);
    }
}
