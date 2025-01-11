import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt(), revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed number: " + revNum);
        sc.close();
    }
}
