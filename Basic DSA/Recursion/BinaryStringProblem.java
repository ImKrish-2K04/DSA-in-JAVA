public class BinaryStringProblem {

    // Recursive method to generate binary strings of length 'n' without consec. 1s
    public static void binaryString(int n, int prevBit, String str) {
        // Base case: If the length of the string becomes 'n', print the result
        if (n == 0) {
            System.err.println(str); // Output the valid binary string
            return;
        }

        // Case 1: Add '0' to the current string
        binaryString(n - 1, 0, str + "0");

        // Case 2: Add '1' to the current string only if the previous bit is '0'
        if (prevBit == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // Generate and print all binary strings of length 3 without consecutive 1s
        binaryString(3, 0, "");
    }
}
