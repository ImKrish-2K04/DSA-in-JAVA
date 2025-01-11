import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        /*
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        // ? upper-part till 5-stars..

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ? lower-part from 4-stars..

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
