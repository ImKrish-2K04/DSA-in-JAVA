public class AdvanceBinarySearch {
    public static int binarySearch(int arr[], int target) {
        int n = arr.length, start = 0, end = n - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                if (isAscending) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (isAscending) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void showResult(int arr[], int target) {
        int ind = binarySearch(arr, target);

        if (ind != -1) {
            System.out.println(target + " found on index: " + ind);
        } else {
            System.out.println(target + " not found!");
        }
    }

    public static void main(String[] args) {
        int ascArr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int descArr[] = { 16, 14, 12, 10, 8, 6, 4, 2 };
        int target1 = 14, target2 = 6;

        System.out.println("Check for Ascending array..");
        showResult(ascArr, target1); // found on index : 6
        System.out.println("Check for Descending array..");
        showResult(descArr, target2); // found on index : 5
    }
}
