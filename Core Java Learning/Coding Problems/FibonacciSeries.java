import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second, temp = 0, n; // i = 3 -> this should be added during while loop...
        first = 0;
        second = 1;

        System.out.println("enter number: ");
        n = sc.nextInt();

        System.out.print(first + " " + second);

        // fibonacci series by for-loop

        for (int i = 3; i <= n; i++) {
            temp = first + second;
            System.out.print(" " + temp);
            first = second;
            second = temp;
        }

        // fibonacci series by while-loop

        // while (i <= n) {
        // temp = first + second;
        // first = second;
        // second = temp;
        // System.out.print(" " + temp);
        // i++;
        // }

        System.out.println("\nThe number at " + n + "th position is: " + temp);

        sc.close();
    }
}
