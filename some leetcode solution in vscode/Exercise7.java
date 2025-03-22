public class Exercise7 {
    public static void findRange(int arr[], int target) {
        int st = 0, end = 1;
        int newSt = 0;

        while (target > arr[end]) {
            newSt = end + 1;
            end = end + (end - st + 1) * 2;
            st = newSt;
        }

        System.out.println("Start: " + st);
        System.out.println("End: " + end);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
        int target = 15;
        findRange(arr, target);
    }
}
