import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         */

        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                if (j != i) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
