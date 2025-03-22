import java.util.Scanner;

public class GettersAndSetters {
    Scanner sc = new Scanner(System.in);

    public String username;
    private String password;

    // setter method
    public void setDetails() {
        System.out.print("Enter username: ");
        this.username = sc.next();
        System.out.print("Enter password: ");
        this.password = sc.next();
    }
    
    // getter method
    public void showMyDetails() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
    }

    public static void main(String[] args) {
        GettersAndSetters gs = new GettersAndSetters();
        gs.setDetails();
        gs.showMyDetails();
    }
}
