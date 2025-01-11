import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        /*
        A
        BB
        CCC
        */
        
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 65;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }

        sc.close();
    }
}
