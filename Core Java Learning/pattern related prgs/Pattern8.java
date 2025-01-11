import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        
        /*
        4 3 2 1
        3 2 1
        2 1
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
                System.out.print(j);
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
