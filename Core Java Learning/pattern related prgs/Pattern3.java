import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        /*
        1 1 1
        2 2 2
        3 3 3
        */
        
        Scanner sc = new Scanner(System.in);
        int num, i = 1;

        System.out.print("enter your boundary: ");
        num = sc.nextInt();

        while (i <= num) {
            int j = 1;
            while (j <= num) {
                System.out.print(i);
                if (j != num) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
