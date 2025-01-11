import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        // write a java program to find whether the given number is a power of 2 or not?

        Scanner sc = new Scanner(System.in);

        /*
         * power of 2 using in-built function:
         * 
         * int num = 16;
         * boolean isPowerOf2 = false;
         * for (int i = 0; i <= 30; i++) {
         * if (Math.pow(2, i) == num) {
         * isPowerOf2 = true;
         * break;
         * }
         * }
         * if (isPowerOf2 == true)
         * System.out.println(num + " is power of 2");
         * else
         * System.out.println(num + " is not a power of 2");
         */

        /*
         * power of 2 without using any in-built function but using a loop:
         * 
         * int num, count = 0;
         * System.out.print("enter number: ");
         * num = sc.nextInt();
         * 
         * while (num > 0) {
         * if ((num & 1) == 1) {
         * count++;
         * }
         * num = num >> 1;
         * }
         * 
         * if (count == 1) {
         * System.out.println("is power of 2");
         * } else {
         * System.out.println("is not a power of 2");
         * }
         */

        // ? power of 2 without using any in-built functions and without any loops!

        int num;
        System.out.print("enter number: ");
        num = sc.nextInt();

        if ((num > 0) && ((num & (num - 1)) == 0)) {
            System.out.println("number is a power of 2.");
        } else {
            System.out.println("number is not a power of 2.");
        }

        sc.close();
    }
}
