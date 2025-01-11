import java.util.*;

public class MultiDimArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("enter value: ");
                arr[row][col] = sc.nextInt();
            }
        }

        for (int r[] : arr) {
            for (int data : r) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
