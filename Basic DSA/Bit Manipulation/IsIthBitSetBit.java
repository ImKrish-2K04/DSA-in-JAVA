public class IsIthBitSetBit {
    /*
    public static void isSetBit(int n, int pos) {
        int bitMask = 1 << pos; // Create a bitmask with the bit at position 'pos' set
        int result = n & bitMask; // Apply bitwise AND to isolate the bit at position 'pos'
        if (result != 0) {
            System.out.println("Yes, the bit at position " + pos + " is set!");
        } else {
            System.out.println("No, the bit at position " + pos + " is not set.");
        }
    }
    */

    public static void isSetBit(int n, int pos) {
        int result = n >> pos;
        if ((result & 1) == 1) {
            System.out.println("Yes, the bit at position " + pos + " is set!");
        } else {
            System.out.println("No, the bit at position " + pos + " is not set.");
        }
    }

    public static void main(String[] args) {
        int num = 27, pos = 1;
        isSetBit(num, pos);
    }
}
