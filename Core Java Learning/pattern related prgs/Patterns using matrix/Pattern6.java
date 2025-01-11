import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // ? printing K with providing range dynamically...
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        if (n <= 3) {
            System.out.println("please enter at least 5.");
        } else if (n % 2 == 0) {
            System.out.println("ODD value is must! sorry.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n / 2 + 1); j++) {
                    if ((j == 1) || (i + j == ((n / 2) + 2)) || (i - j == (n / 2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
