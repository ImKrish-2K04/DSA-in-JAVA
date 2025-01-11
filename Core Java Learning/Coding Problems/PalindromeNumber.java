import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dig = 0, result = 0;

        System.out.print("enter number: ");
        num = sc.nextInt();
        int temp = num;

        while (temp > 0) {
            dig = temp % 10;
            result = result * 10 + dig;
            temp /= 10;
        }

        if (num == result)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

        sc.close();
    }
}
