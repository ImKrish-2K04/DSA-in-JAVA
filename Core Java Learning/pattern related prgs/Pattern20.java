import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        /*
         * ABC
         * BCD
         * CDE
         */

        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 65;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char temp = ch;
            for (int j = 1; j <= n; j++) {
                System.out.print(temp);
                temp++;
            }
            ch++;
            System.out.println();
        }

        sc.close();
    }
}
