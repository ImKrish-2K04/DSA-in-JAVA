import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        
        /*
        3 2 1
        3 2 1
        3 2 1
        */
        
        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

        while (i <= n) {
            int j = n;
            while (j >= 1) {
                System.out.print(j);
                if (j != 1) {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
