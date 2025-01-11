import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PowerFunction d1 = new PowerFunction();
        int n, p, result;

        System.out.println("Enter a no: ");
        n = sc.nextInt();
        System.out.println("Enter power: ");
        p = sc.nextInt();
        result = d1.power(n, p);
        System.out.println(n + " raised to " + p + " is: " + result);
        sc.close();
    }

    public int power(int n, int p) {
        int result = n;
        if (p == 0)
            return 1;
        else if (p == 1)
            return n;
        else {
            for (int i = 2; i <= p; i++) {
                result *= n;
            }
            return result;
        }
    }
}
