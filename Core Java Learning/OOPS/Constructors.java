import java.util.Scanner;

public class Constructors {
    Scanner sc = new Scanner(System.in);
    
    // there are three types of constructors!
    // 1) non-parameterized constructor
    // 2) parameterized constructor
    // 3) copy constructor

    public int rno;
    public String name;
    private String password;

    Constructors() {
        System.out.println("object created successfully!");
    }

    // parameterized constructor
    Constructors(int rno, String name) {
        this.rno = rno;
        this.name = name;
        System.out.print("enter password: ");
        this.password = sc.next();
    }

    // copy constructor
    Constructors(Constructors ob1) {
        this.name = ob1.name;
        this.rno = ob1.rno;
    }

    public void setPass(String pass) {
        this.password = pass;
        System.out.println("password set successfully!");
    }

    public void showPass() {
        System.out.println("Password is: " + this.password);
    }
    
    public static void main(String[] args) {
        // Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(74, "Krushn");
        Constructors c3 = new Constructors(c2);

        System.out.println(c2.name);
        System.out.println(c3.name);
        c3.setPass("rajaram1212");

        c2.showPass();
        c3.showPass();
    }
}
