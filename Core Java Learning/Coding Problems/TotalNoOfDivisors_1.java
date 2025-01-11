import java.util.Scanner;

public class TotalNoOfDivisors_1 {
    public static void main(String[] args) {
        // print all divisors of a given number!

        Scanner sc = new Scanner(System.in);
        int num, tnd = 0, i = 1;

        System.out.print("enter number: ");
        num = sc.nextInt();

        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
                tnd++;
            }
            i++;
        }

        System.out.println("\ntotal no of divisor of " + num + " is: " + tnd);

        sc.close();
    }
}
