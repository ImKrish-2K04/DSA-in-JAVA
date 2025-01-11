public class BinarySearchAlgo {
    public static int binarySearch(int arr[], int target) {
        int n = arr.length, start = 0, end = n - 1, mid = -1;

        while (start <= end) {
            mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 }, target = 12;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println(target + " found on index: " + result);
        } else {
            System.out.println(target + " not found in array!");
        }
    }
}
