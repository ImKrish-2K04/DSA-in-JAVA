import java.util.Arrays;

public class ProductOfArrayElements {
    /*
    ? leet code problems:
    
    ! 238 - 'product of array itself'
    * 169 - Majority element
    * 645 - set mismatch
    
    ! product of an array except itself...
    
    ? here, we have to create a resulting array, in which we need to store the product of each elements instead of the current index value...
    ? suppose, we are currently on index 3, and the total length of our array is 6, then we have to find the product of each elements of the array except the value at index 3. and store that product on index 3 of resulting array...
    
    ? for finding this, we need two arrays: 1) prefix & 2) suffix
    ? both contains the product of array elements but in different manners.
    
    ? 1) prefix:
    * the formula or syntax for prefix is: prefix[i] = prefix[i'th index - 1] * arr[i]
    * where, the first index of prefix (i.e. 0th index) is set by arr[0], and the further process will start from index 1 till index (n-1)...
    
    ? 2) suffix:
    * the formula for suffix is: suffix[i] = suffix[i'th index + 1] * arr[i]
    * where, the last index of suffix (i.e. n-1th index) is set by arr[n-1] and the further process will continues till index 0...
    */

    public static void productOfArrayElements(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
        }

        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i];
        }

        result[0] = suffix[1];

        for (int i = 1; i < n - 1; i++) {
            result[i] = prefix[i - 1] * suffix[i + 1];
        }

        result[n - 1] = prefix[n - 2];

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        productOfArrayElements(arr);
    }
}
