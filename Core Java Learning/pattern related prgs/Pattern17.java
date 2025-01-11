import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        /*
         * A B C
         * A B C
         * A B C
         */

        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            char ch = 65;
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
