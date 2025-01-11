import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        /*
         * 1
         * 23
         * 456
         * 78910
         */

        Scanner sc = new Scanner(System.in);
        int n, cnt = 1, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(cnt);
                cnt++;
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
