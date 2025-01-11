import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // main declarations:
        Scanner sc = new Scanner(System.in);
        char operator, ch = 'y';
        int n1, n2;
        Calculator cl = new Calculator();

        // iteration of operations as per your choice.
        do {
            if (ch == 'y' || ch == 'Y') {
                System.out.println("Enter value 1: ");
                n1 = sc.nextInt();
                System.out.println("Enter value 2: ");
                n2 = sc.nextInt();

                System.out.println("Enter your choice (*, /, +, -, %)");
                operator = sc.next().charAt(0);
                cl.calc(n1, n2, operator);
            } else if (ch == 'n' || ch == 'N') {
                System.out.println("Thanks for using our calculator!");
                break;
            } else {
                System.out.println("you have entered an inapropriate choice!");
            }
            System.out.println("Do you want to calculate more? (y/n):");
            ch = sc.next().charAt(0);
        } while (ch != 'y' || ch != 'Y'); // must runs for first time and further depends on input!
        sc.close();
    }

    public void calc(int n1, int n2, char operator) {
        int result;
        switch (operator) {
            case '+':
                // Addition Operation...
                result = n1 + n2;
                System.out.println("result of addition of these 2 numbers is: " + result);
                break;
            case '-':
                // Substraction Operation...
                result = n1 - n2;
                System.out.println("result of Substraction of these 2 numbers is: " + result);
                break;
            case '*':
                // Multiplication Operation...
                result = n1 * n2;
                System.out.println("result of Multiplication of these 2 numbers is: " + result);
                break;
            case '/':
                // Dividation Operation...
                if (n2 == 0) {
                    System.out.println("You can't divide any number by 0!");
                    break;
                }
                result = n1 / n2;
                System.out.println("result of Dividation of these 2 numbers is: " + result);
                break;
            case '%':
                // Modulus Operation...
                result = n1 % n2;
                System.out.println("the remainder after division is: " + result);
                break;
            default:
                System.out.println("Inappropriate operator entered!");
        }
    }
}
