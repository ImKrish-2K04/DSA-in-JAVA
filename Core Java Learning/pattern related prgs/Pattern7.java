import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        
        /*
        1
        2 2
        3 3 3
        4 4 4 4
        */
        
        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.print("enter the boundary: ");
        n = sc.nextInt();

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
