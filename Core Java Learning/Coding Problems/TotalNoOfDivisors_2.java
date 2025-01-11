import java.util.Scanner;

public class TotalNoOfDivisors_2 {
    public static void main(String[] args) {
        // find the total no of factors of a given number!

        Scanner sc = new Scanner(System.in);
        int num, i = 1, tnd = 0;

        System.out.print("enter number: ");
        num = sc.nextInt();

        while (i <= (int) Math.sqrt(num)) {
            if (num % i == 0) {
                if (i * i == num) {
                    tnd++;
                } else {
                    tnd += 2;
                }
            }
            i++;
        }

        System.out.println("total no of factors are: " + tnd);

        sc.close();
    }
}
