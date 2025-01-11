import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // enter a year and check whether it is a leap year or not!

        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("enter a year: ");
        year = sc.nextInt();

        // if any one of the condition is not fulfills, it will check for second due to OR operator!
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
