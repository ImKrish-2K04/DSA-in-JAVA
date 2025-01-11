import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        /*
         * 1
         * 2 1
         * 3 2 1
         * 4 3 2 1
         */

        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int j = i;
            while (j >= 1) {
                System.out.print(j);
                if (j != 1) {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
