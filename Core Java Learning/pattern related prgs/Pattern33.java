import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        /*
            1
           23
          456
         78910
         */

        Scanner sc = new Scanner(System.in);
        int n, count = 1;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

        sc.close();
    }
}
