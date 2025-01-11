import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        /*
        1
        22
        333
        4444
        55555
        */
        
        Scanner sc = new Scanner(System.in);
        int n, counter = 1;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - j >= 0) {
                    System.out.print(counter);
                }
            }
            counter++;
            System.out.println();
        }

        sc.close();
    }
}
