import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        /*
         * A A A
         * B B B
         * C C C
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
                j++;
            }
            System.out.println();
            i++;
            ch++;
        }

        sc.close();
    }
}
