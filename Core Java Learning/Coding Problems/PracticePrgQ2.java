import java.util.Scanner;

public class PracticePrgQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, choice = 0, sumOfEven = 0, sumOfOdd = 0, counter = 3;

        do {
            System.out.print("enter a number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }

            System.out.print("do you want to add again? (1/0): ");
            choice = sc.nextInt();

            if (choice != 0 && choice != 1) {
                while (counter > 0) {
                    System.out.println("you have just [" + (counter) + "/3] chances left for entering choice!");
                    System.out.print("do you want to add again? (1/0): ");
                    choice = sc.nextInt();
                    if (choice == 0 || choice == 1) {
                        counter--;
                        break;
                    } else {
                        counter--;
                        if (counter == 0) {
                            System.out.println("due to your misbehavior, the process is terminated!");
                            break;
                        }
                    }
                }
            }
        } while (choice == 1);

        System.out.println("the sum of even numbers: " + sumOfEven);
        System.out.println("the sum of odd numbers: " + sumOfOdd);

        sc.close();
    }
}
