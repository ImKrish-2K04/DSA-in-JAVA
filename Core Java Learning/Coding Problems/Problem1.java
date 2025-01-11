import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /*
         * ? Substract the product and sum of digits of an integer...
         * ? STEPS:
         * 
         * 1. take a number from user
         * 2. count the sum of digits and product of digits
         * 3. substract the sum from the product
         */

        Scanner sc = new Scanner(System.in);
        int num = 0, sum = 0, product = 1;

        System.out.println("Enter number: ");
        num = sc.nextInt();
        // 123 : use-case for experiment
        while (num > 0) {
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }

        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Substraction of Sum from Product: " + (product - sum));

        sc.close();
    }
}
