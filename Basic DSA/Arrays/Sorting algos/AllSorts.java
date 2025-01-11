import java.util.*;

public class AllSorts {
    public static void bubbleSort(int arr[]) {
        int swap, len = arr.length;

        // Outer loop runs for 'n-1' rounds to sort the array.
        for (int i = 1; i < len; i++) {
            swap = 0;
            // Inner loop compares adjacent elements and pushes the largest unsorted value
            // to its correct position in the current round.
            for (int j = 0; j < len - i; j++) {
                // Swap if the current value is smaller than the next value (for descending
                // order).
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            // If no swaps occurred, the array is already sorted.
            if (swap == 0)
                break;
        }
        System.out.println("Using bubble sort: " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        int min, swap;
        // Outer loop selects the starting position for the current round.
        for (int i = 0; i < arr.length - 1; i++) {
            swap = 0;
            min = i; // Assume the value at index 'i' is the smallest in the remaining array.
            // Inner loop finds the actual smallest value in the unsorted portion.
            for (int j = i + 1; j < arr.length; j++) {
                // Update 'min' if a smaller value is found.
                if (arr[min] > arr[j]) {
                    min = j;
                    swap++;
                }
            }
            // If no smaller value was found, exit early as the array is sorted.
            if (swap == 0)
                break;
            // Swap the smallest value found with the value at index 'i'.
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Using selection sort: " + Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {
        // Outer loop picks the current value starting from the second element.
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Current value to be placed in the sorted portion.
            int prev = i - 1; // Points to the previous element in the sorted portion.

            // Shift all elements larger than 'curr' one position to the right.
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Place 'curr' in its correct position in the sorted portion.
            arr[prev + 1] = curr;
        }
        System.out.println("Using insertion sort: " + Arrays.toString(arr));
    }

    public static void countSort(int arr[]) {
        int max = Integer.MIN_VALUE;

        // Step 1: Find the maximum value in the array to determine the size of the
        // count array.
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Step 2: Initialize a count array of size (max + 1) with default values of 0.
        int count[] = new int[max + 1];

        // Step 3: Count the frequency of each element in the input array.
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // Increment the count at the index corresponding to the element value.
        }

        int index = 0; // Pointer for placing sorted elements back into the original array.

        // Step 4: Traverse the count array to place elements in sorted order.
        for (int i = 0; i < count.length; i++) {
            int freq = count[i]; // Frequency of the current element.

            // Place the element (index `i`) `freq` times in the array.
            while (freq > 0) {
                arr[index] = i; // Assign the value `i` to the current position in the array.
                freq--; // Reduce frequency count for this value.
                index++; // Move to the next position in the array.
            }
        }

        // Print the sorted array.
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 1, 5, 9, 7, 4 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countSort(arr);
    }
}
