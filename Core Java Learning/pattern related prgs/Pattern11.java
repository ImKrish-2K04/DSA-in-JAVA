import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        /*
        4444
         333
          22
           1
          22
         333
        4444
        */
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}
