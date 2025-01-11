import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        /*
           1
          121
         12321
        1234321
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if(i>=2) {
                for(int j=i; j>1; j--) {
                    System.out.print(j-1);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
