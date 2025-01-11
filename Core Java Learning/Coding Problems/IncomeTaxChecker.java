import java.util.Scanner;

public class IncomeTaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income, tax;

        System.out.print("enter number: ");
        income = sc.nextInt();

        if (income < 500000) {
            System.out.println("you are tax free!");
        } else if (income >= 500000 && income < 1000000) {
            tax = (income * 20) / 100;
            System.out.println("you have to pay your tax: " + tax);
        } else if (income >= 1000000) {
            tax = (income * 30) / 100;
            System.out.println("you have to pay your tax: " + tax);
        }

        sc.close();
    }
}
