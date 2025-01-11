import java.util.Scanner;

public class TwosComplement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwosComplement_2 tc2 = new TwosComplement_2();
        int num;

        System.out.print("enter a number: ");
        num = sc.nextInt();
        tc2.twosComplement(num);

        sc.close();
    }

    public StringBuilder reverseString(StringBuilder str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp;
    }

    public void twosComplement(int num) {
        int carry = 1;
        TwosComplement_2 tc2 = new TwosComplement_2();
        StringBuilder binaryRepresentation = new StringBuilder();
        StringBuilder onesComp = new StringBuilder();
        StringBuilder twosComp;

        while (num > 0) {
            binaryRepresentation.append(num % 2);
            num /= 2;
        }

        binaryRepresentation = tc2.reverseString(binaryRepresentation);

        System.out.println("The binary representation of a given value is: " + binaryRepresentation);

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char ch = (binaryRepresentation.charAt(i) == '1') ? '0' : '1';
            onesComp.append(ch);
        }

        System.out.println("The 1's complement of binary representation is: " + onesComp);

        twosComp = new StringBuilder(onesComp);

        for (int i = twosComp.length() - 1; i >= 0; i--) {
            if ((twosComp.charAt(i) == '1') && carry == 1) {
                twosComp.setCharAt(i, '0');
                carry = 1;
            } else if ((twosComp.charAt(i) == '0') && carry == 1) {
                twosComp.setCharAt(i, '1');
                carry = 0;
            }
        }

        System.out.println("The 2's complement of given number is: " + twosComp);
    }
}
