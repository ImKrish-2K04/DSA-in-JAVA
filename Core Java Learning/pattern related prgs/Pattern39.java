import java.util.Scanner;

public class Pattern39 {
    public static void main(String[] args) {
        /*
        ----*
        ---*-
        --*--
        -*---
        *----
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        sc.close();
    }
}
