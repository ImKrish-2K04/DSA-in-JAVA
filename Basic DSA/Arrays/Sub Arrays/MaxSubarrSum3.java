public class MaxSubarrSum3 {
    /*
     * Kadane's Algorithm:
     * -------------------
     * This algorithm finds the maximum sum of a subarray in O(n) time.
     * 
     * Steps:
     * 1. Use two variables:
     * - sum: Tracks the current subarray sum.
     * - maxSum: Tracks the maximum subarray sum found so far.
     * 2. Traverse the array:
     * - Add the current element to sum.
     * - If sum becomes negative, reset it to 0 (discard the current subarray).
     * - Update maxSum with the maximum of maxSum and sum.
     * 3. Edge Case:
     * - If the array contains all negative elements, ensure the maximum single
     * element is considered.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void kadanesAlgo(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxNegVal = Integer.MIN_VALUE;
        boolean isNegativeArr = true;

        for (int i = 0; i < arr.length; i++) {
            sum = ((sum + arr[i]) < 0) ? 0 : (sum + arr[i]);
            maxSum = (maxSum < sum) ? sum : maxSum;
            if (arr[i] > 0) {
                isNegativeArr = false;
            } else {
                maxNegVal = (maxNegVal < arr[i]) ? arr[i] : maxNegVal;
            }
        }

        if (isNegativeArr) {
            System.out.println(maxNegVal);
        } else {
            System.out.println("Max sum found is: " + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr2[] = { -5, -3, -6, -2, -8 };
        kadanesAlgo(arr);
        kadanesAlgo(arr2);
    }
}
