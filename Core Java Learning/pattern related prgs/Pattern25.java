import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        /*
         * D
         * DC
         * DCB
         * DCBA
         */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            char ch = 68;
            for (int j = n; j >= i; j--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }

        sc.close();
    }
}
