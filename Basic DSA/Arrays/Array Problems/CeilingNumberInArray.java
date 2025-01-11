public class CeilingNumberInArray {
    /*
     * Ceiling Element in a Sorted Array:
     * ----------------------------------
     * The ceiling element of a target is defined as the smallest number
     * in the array that is greater than or equal to the target element.
     *
     * Key Points:
     * 1. The array must be sorted (either in ascending or descending order).
     * 2. If the target is present in the array, the ceiling is the target itself.
     * 3. If the target is greater than the largest element in the array,
     * the ceiling does not exist.
     *
     * Example (Ascending Array):
     * Array: [2, 4, 6, 8, 11, 14]
     * Target: 9
     * Ceiling: 11 (smallest number >= 9)
     *
     * Example (Descending Array):
     * Array: [20, 15, 10, 5, 1]
     * Target: 12
     * Ceiling: 15 (smallest number >= 12)
     */

    public static int findCeiling(int[] arr, int target) {
        int n = arr.length, st = 0, end = n - 1;
        boolean isAsc = arr[st] < arr[end];

        // Boundary check
        if ((isAsc && target > arr[end]) || (!isAsc && target > arr[st])) {
            return -1; // Target exceeds array bounds
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return isAsc ? st : st - 1; // Adjust for ascending/descending
    }

    public static void showResult(int[] arr, int target) {
        int ind = findCeiling(arr, target);
        if (ind == -1 || ind < 0 || ind >= arr.length) {
            System.out.println("Ceiling is not found in the array!");
        } else {
            System.out.println("Ceiling is " + arr[ind] + " at index " + ind);
        }
    }

    public static void main(String[] args) {
        int[] ascArr = { 2, 4, 6, 7, 8, 11, 13, 17, 20 };
        int[] descArr = { 16, 14, 12, 10, 8, 6, 4, 2 };
        int target1 = 15, target2 = 2;

        System.out.println("Check for Ascending array...");
        showResult(ascArr, target1); // Ceiling should be 17
        System.out.println("Check for Descending array...");
        showResult(descArr, target2); // Ceiling should be 6
    }
}
