import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        /*
        4
        43
        432
        4321
        */
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
