import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        /*
         * 1
         * 2 3
         * 3 4 5
         * 4 5 6 7
         */

        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int k = i, j = 1;
            while (j <= i) {
                System.out.print(k);
                if (j != i) {
                    System.out.print(" ");
                }
                k++;
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
