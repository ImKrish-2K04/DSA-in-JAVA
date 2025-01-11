import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short studentID, studentGrade;
        float gpa;
        String name;

        System.out.println("Student registration form:");
        System.out.print("Enter student ID: ");
        studentID = sc.nextShort();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter grade: ");
        studentGrade = sc.nextShort();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine(); //! extra nextline added to make the following nextLine() input process function properly, it is required when you are using nextShort(), nextFloat(), etc. like methods before!
        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println();
        System.out.println("Congratulations, you have successfully been registered.");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("GPA: " + gpa);
        System.out.println("Address: " + address);
        
        sc.close();
    }
}
