import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int decimal = 0, i = 0, num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        num = sc.nextInt();
        // conversion from binary to decimal
        while (num > 0) {
            decimal += (num % 10) * Math.pow(2, i);
            i++;
            num /= 10;
        }
        // Odd-Even checking
        if (decimal % 2 == 0)
            System.out.println("The given number is even!");
        else
            System.out.println("The given number is odd!");
        sc.close();
        // use-cases: 1) 1000111 2) 10000000
    }
}
