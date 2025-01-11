import java.util.Arrays;

public class SearchInSortedArray {

    // Recursive function to search for the target in a rotated sorted array
    public static int searchTarget(int arr[], int si, int ei, int target) {
        // Base case: If the search range is invalid, the target is not in the array
        if (si > ei) {
            return -1;
        }

        // Avoid overflow with si + (ei - si) / 2
        int mid = si + (ei - si) / 2;

        // Check if the mid-point is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            // If the target lies within the sorted left half, search there
            if (arr[si] <= target && target < arr[mid]) {
                return searchTarget(arr, si, mid - 1, target);
            } else { // Otherwise, search in the right half
                return searchTarget(arr, mid + 1, ei, target);
            }
        } else { // Otherwise, the right half must be sorted
            // If the target lies within the sorted right half, search there
            if (arr[mid] < target && target <= arr[ei]) {
                return searchTarget(arr, mid + 1, ei, target);
            } else { // Otherwise, search in the left half
                return searchTarget(arr, si, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = -2;

        // Check for empty or null array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid!");
            return;
        }

        // Perform the search and get the index of the target
        int ind = searchTarget(arr, 0, arr.length - 1, target);

        // Output the result
        if (ind == -1) {
            System.out.println("Target : " + target + ", is not found in the array.\n" + Arrays.toString(arr));
        } else {
            System.out.println("Target : " + target + ", found at index " + ind);
        }
    }
}
