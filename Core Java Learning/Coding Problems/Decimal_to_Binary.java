import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Decimal_to_Binary dtb = new Decimal_to_Binary();
        // Decimal_to_Binary.decimalToBinary(102);
        dtb.dToB();
    }

    public static void decimalToBinary(int n) {
        int binary = 0, i = 0, val = n;
        while (val > 0) {
            binary += (val % 2) * Math.pow(10, i);
            val = val / 2;
            i++;
        }
        System.out.println("binary representation of " + n + " is: " + binary);
    }

    public void dToB() {
        Scanner sc = new Scanner(System.in);
        int bit = 0, i = 0, result = 0, num = 0;
        System.out.println("enter number: ");
        num = sc.nextInt();
        // 6 : 110
        while (num > 0) {
            bit = num % 2;
            if (bit == 1) {
                result = (int) (result + bit * Math.pow(10, i));
            }
            i++;
            num /= 2;
        }

        System.out.println(result);
        sc.close();
    }
}
