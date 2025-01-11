import java.util.Scanner;

public class Pattern41 {
    public static void main(String[] args) {
        /*
            *
           * *
          *   *
         *     *
        *       *
         *     *
          *   *
           * *
            *
        */
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j < i; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            if (i != n) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
