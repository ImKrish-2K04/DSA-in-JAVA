import java.util.Scanner;

public class Pattern44 {
    public static void main(String[] args) {
        /*
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
