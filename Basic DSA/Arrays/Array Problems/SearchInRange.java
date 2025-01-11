public class SearchInRange {
    public static void searchInRange(int arr[], int target, int start, int end) {
        boolean isFound = false;

        if (arr.length == 0) {
            System.out.println("please provide a good array.");
        } else if (start >= end) {
            System.out.println("please provide an appropriate value of starting and ending index.");
        } else {
            for (int i = start; i <= end; i++) {
                if (arr[i] == target) {
                    isFound = true;
                }
            }

            if (isFound) {
                System.out.println(target + " exists in the given range.");
            } else {
                System.out.println(target + " not exists in the given range.");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 3, 14, 28 };
        int target = 14;
        searchInRange(arr, target, 2, 4);
    }
}
