import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        int decimal = 0, i = 0, num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        num = sc.nextInt();
        while (num > 0) {
            decimal += (num % 10) * Math.pow(2, i);
            i++;
            num /= 10;
        }
        System.out.println(decimal);
        sc.close();
    }
}
