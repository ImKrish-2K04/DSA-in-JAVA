import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if (num < 2) {
            System.out.println("The number is not a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is a prime number.");
            } else {
                System.out.println("The number is not a prime number.");
            }
        }

        sc.close();
    }
}
