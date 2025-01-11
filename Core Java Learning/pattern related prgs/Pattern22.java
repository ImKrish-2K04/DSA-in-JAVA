import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        /*
         * A
         * BC
         * DEF
         * GHIJ
         * KLMNO
         */

        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 65;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
