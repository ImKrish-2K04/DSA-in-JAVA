import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        /*
         * A B C
         * D E F
         * G H I
         */

        Scanner sc = new Scanner(System.in);
        int n, i = 1;
        char ch = 65;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(ch);
                if (j != n) {
                    System.out.print(" ");
                }
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
