import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // Outer loop iterates through each element to position it correctly
        for (int i = 0; i < n - 1; i++) {
            int min = i; // Assume the current index holds the minimum value
            int swap = 0; // Tracks if a swap is needed for early termination

            // Inner loop finds the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) { // Update min index if a smaller element is found
                    min = j;
                    swap++; // Mark that a swap will be required
                }
            }

            // Exit early if no swaps were needed (array is already sorted)
            if (swap == 0) {
                break;
            } else {
                // Swap the smallest element with the element at the current index
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
    }
}
