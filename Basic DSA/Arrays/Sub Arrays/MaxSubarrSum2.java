public class MaxSubarrSum2 {
    // in this program, we are going to learn how to reduce the time-complexity from 'O(n^3)' to 'O(n^2)' just by using 'prefix-array'..

    // in prefix-array on i'th index there is a sum of all elements of given array till i'th index...

    // formula to create a "prefix-array : prefix[i] = prefix[i-1] + arr[i]"

    // first of all , we have to assign the prefix[0] with arr[0], because we can't calculate this for 0th index, hence we will start our loop from 1st index till (n-1)'th..

    // and at last, in our maxSum finding looping structure, we'll using another formula to finding the maxSum of elements of sub-arrays...

    // formula : prefix[end] - prefix[start-1];

    // but if start (i.e outer loop) is == 0, then return prefix[end] (end is a pointer of inner loop).

    public static void subarrMaxSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = (i == 0) ? (prefix[j]) : (prefix[j] - prefix[i - 1]);
                maxSum = (maxSum < sum) ? sum : maxSum;
            }
        }

        System.out.println("maxSum is found: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarrMaxSum(arr);
    }
}
