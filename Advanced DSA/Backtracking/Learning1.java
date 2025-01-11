import java.util.Arrays;

public class Learning1 {
    // Backtracking on arrays:

    public static void fillArray(int arr[], int val, int i) {
        // base-case:
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        // work
        arr[i] = val;

        // recursion
        fillArray(arr, val + 1, i + 1);

        // backtracking and updating array elements..
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        fillArray(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
