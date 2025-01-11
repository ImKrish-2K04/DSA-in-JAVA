import java.util.Scanner;

public class HammingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n, count = 0;

        System.out.print("Enter number: ");
        num = sc.nextInt();
        n = num;

        // if LSB = 1, LSB & 1 = 1
        // if LSB = 0, LSB & 1 = 0

        while (num > 0) {
            int bit = (num & 1); // (LSB AND 1) operation..
            if (bit == 1) { // if bit is 1 then enters into the block, else continues...
                count++;
            }
            num = num >> 1; // due to this, the number will must become 0 at some instance!
        }

        System.out.println("total no of 1's in binary representation of " + n + " is: " + count);
        sc.close();
    }
}
