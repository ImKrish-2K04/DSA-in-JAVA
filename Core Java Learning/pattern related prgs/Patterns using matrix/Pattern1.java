import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
