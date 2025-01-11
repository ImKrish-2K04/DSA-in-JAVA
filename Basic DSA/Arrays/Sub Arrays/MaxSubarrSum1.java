public class MaxSubarrSum1 {

    // ! we will using the same approach of finding the sub-array element sum in this code.

    // ! here we will try to find the maximum sub-array element sum and this will be a brute-force approach to achieve this result!..

    // ! time complexity of this brute-force approach is "O(n^3)" which is worst than worst!! because there are three loops and they are following nested loops concept and each runs n times...

    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = (maxSum < sum) ? sum : maxSum;
                minSum = (sum < minSum) ? sum : minSum;
            }
        }

        System.out.println("the maximum sum found by calculating sum of elements of sub-arrays is: " + maxSum);

        System.out.println("the minimum sum found by calculating sum of elements of sub-arrays is: " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(arr);
    }
}
