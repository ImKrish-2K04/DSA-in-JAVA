import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        /*
        4 4 4 4
        3 3 3
        2 2
        1
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

        sc.close();
    }
}
