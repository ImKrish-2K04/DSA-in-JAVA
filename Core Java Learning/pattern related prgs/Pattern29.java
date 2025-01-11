import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        /*
         E
         DE
         CDE
         BCDE
         ABCDE
         */

        Scanner sc = new Scanner(System.in);
        int n;
        char ch;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            ch = (char) (65 + n - i);
            for (int j = 0; j < i; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.println();
        }

        sc.close();
    }
}
