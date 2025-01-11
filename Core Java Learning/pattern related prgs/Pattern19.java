import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        /*
         * 123
         * 234
         * 345
         */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

        sc.close();
    }
}
