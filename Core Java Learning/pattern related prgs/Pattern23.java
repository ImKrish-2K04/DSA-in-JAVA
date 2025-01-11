import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        /*
        A
        BC
        CDE
        EFGH
        FGHIJ
        */
        
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 65;

        System.out.print("enter boundary: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char tmp = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(tmp);
                tmp++;
            }
            ch++;
            System.out.println();
        }

        sc.close();
    }
}
