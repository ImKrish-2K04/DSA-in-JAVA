import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        /*
        1 2 3
        1 2 3
        1 2 3
        */
        
        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            // ? total 3 rows will be created...
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                if (j != n) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
