import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        /*
        1
        23
        345
        4567
        56789
        */
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print(k);
                }
                k++;
            }
            System.out.println();
        }

        sc.close();
    }
}
