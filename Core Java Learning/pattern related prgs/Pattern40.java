import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        /*
            *
           * *
          *   *
         *     *
        *       *
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        // ? no of rows counter and iterator...

        for (int i = 1; i <= n; i++) {
            // ? print the starting spaces

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // ? print its following star

            System.out.print("*");
            
            // ? print the following spaces
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // ? print the right side spaces
            
            for (int j = 2; j < i; j++) {
                System.out.print(" ");
            }
            
            // ? print the right most star
            
            if (i != 1) {
                System.out.print("*");
            }
            
            // ? line-break
            
            System.out.println();
        }

        sc.close();
    }
}
