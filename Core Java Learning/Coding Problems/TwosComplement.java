import java.util.Scanner;

public class TwosComplement {
    public static void main(String[] args) {
        int num, bit = 0, carry = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        StringBuilder binaryRepresentation = new StringBuilder();

        while (num > 0) {
            bit = num % 2;
            binaryRepresentation.append(bit);
            num /= 2;
        }

        binaryRepresentation.reverse();
        System.out.println("Binary representation of given number: " + binaryRepresentation);

        StringBuilder onesComplement = new StringBuilder();
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            onesComplement.append(binaryRepresentation.charAt(i) == '1' ? '0' : '1');
        }

        System.out.println("1's complement is: " + onesComplement);

        StringBuilder twosComplement = new StringBuilder(onesComplement);
        for (int j = twosComplement.length() - 1; j >= 0; j--) {
            if (twosComplement.charAt(j) == '1' && carry == 1) {
                twosComplement.setCharAt(j, '0');
            } else if (twosComplement.charAt(j) == '0' && carry == 1) {
                twosComplement.setCharAt(j, '1');
                carry = 0;
            }
        }

        if (carry == 1) {
            twosComplement.insert(0, '1');
        }

        System.out.println("2's complement is: " + twosComplement);
        sc.close();
    }
}