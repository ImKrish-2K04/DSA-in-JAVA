import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        /*
        4 4 4 4
        3 3 3
        2 2
        1
        2 2
        3 3 3
        4 4 4 4
        */
        
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();
        i = n;

        while (i >= 1) {
            int j = i;
            while (j >= 1) {
                System.out.print(i);
                if (j != 1) {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println();
            i--;
        }

        i = 2;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                if (j != i) {
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
