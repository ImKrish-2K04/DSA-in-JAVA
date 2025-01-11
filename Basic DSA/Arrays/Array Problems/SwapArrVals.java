import java.util.Arrays;

public class SwapArrVals {
    public static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        int myArr[] = { 1, 2, 3, 4, 5 };

        System.out.println("before swapping: " + Arrays.toString(myArr));

        swap(myArr, 1, 3);

        System.out.println("after swapping: " + Arrays.toString(myArr));
    }
}
