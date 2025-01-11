import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, temp, result = 0, digit;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        num = sc.nextInt();
        temp = num;

        while (temp > 0) {
            digit = temp % 10;
            result = (int) (result + Math.pow(digit, 3));
            temp /= 10;
        }

        if (num == result)
            System.out.println("is armstrong");
        else
            System.out.println("is not armstrong");

        sc.close();
    }
}
