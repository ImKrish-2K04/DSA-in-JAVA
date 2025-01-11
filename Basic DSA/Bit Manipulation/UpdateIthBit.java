public class UpdateIthBit {
    // Clears the bit at position 'pos' in 'n'
    public static int clearIthBit(int n, int pos) {
        int bitMask = ~(1 << pos);
        int result = n & bitMask;
        return result;
    }

    // Sets the bit at position 'pos' in 'n'
    public static int setIthBit(int n, int pos) {
        int bitMask = 1 << pos;
        int result = n | bitMask;
        return result;
    }

    // Updates the 'pos' bit in 'n' to the value of 'bit' (0 or 1)
    public static void updateIthBit1(int n, int pos, int bit) {
        if (bit == 0) {
            // Clear the bit if 'bit' is 0
            System.out.println("After updating bit to " + bit + ": " + clearIthBit(n, pos));
        } else {
            // Set the bit if 'bit' is 1
            System.out.println("After updating bit to " + bit + ": " + setIthBit(n, pos));
        }
    }

    // Another method to update the 'pos' bit to the value of 'bit'
    public static void updateIthBit2(int n, int pos, int bit) {
        int result = clearIthBit(n, pos); // First, clear the bit
        int bitMask = bit << pos; // Prepare the mask for the new value of the bit
        result = result | bitMask; // Set the new value of the bit
        System.out.println("After updating bit to " + bit + ": " + result);
    }

    public static void main(String[] args) {
        int num = 10, pos = 2, bit = 1;
        updateIthBit1(num, pos, bit); // Update the bit using method 1
        updateIthBit2(num, pos, bit); // Update the bit using method 2
    }
}
