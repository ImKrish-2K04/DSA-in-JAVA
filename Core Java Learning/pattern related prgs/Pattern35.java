import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        /*
        1234554321
        1234**4321
        123****321
        12******21
        1********1
        */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = n; j > i; j--) {
                System.out.print("**"); //? you can also put 2 white-spaces here to make it invisible spaces instead of stars...
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
