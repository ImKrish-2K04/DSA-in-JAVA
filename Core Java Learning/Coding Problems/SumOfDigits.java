import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("enter number: ");
        num = sc.nextInt();

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        System.out.println("sum of digits of given no is: " + sum);

        sc.close();
    }
}
