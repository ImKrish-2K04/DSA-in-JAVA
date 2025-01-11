import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        // write a code to reverse a number and check whether it exceeds the limits of
        // integer or not!

        Scanner sc = new Scanner(System.in);
        ReverseNumber2 rn2 = new ReverseNumber2();
        int num = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        rn2.reverseNumber(num);

        sc.close();
    }

    public void reverseNumber(int n) {
        boolean limitExceeds = false;
        if (n == Integer.MIN_VALUE)
            limitExceeds = true;
        else {
            int no = Math.abs(n), rev = 0, digit;
            while (no > 0) {
                digit = no % 10;
                rev = rev * 10 + digit;
                if (rev > (Integer.MAX_VALUE - digit) / 10) {
                    limitExceeds = true;
                    break;
                }
                no /= 10;
            }

            if (limitExceeds)
                System.out.println("Limit is exceeded, sorry!");
            else {
                if (n < 0)
                    System.out.println(-rev);
                else
                    System.out.println(rev);
            }
        }
    }
}
