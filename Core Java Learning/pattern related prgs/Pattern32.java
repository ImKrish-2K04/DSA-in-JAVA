import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        /*
        1234
         234
          34
           4
        */
    
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
