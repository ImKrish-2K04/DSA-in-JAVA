public class Exercise3 {
    static int cnt = 0;

    public static void findCount(int arr[], int i) {
        if (i == arr.length) {
            System.out.println(cnt);
            return;
        }

        for (int j = i; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                cnt++;
            }
        }

        findCount(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        findCount(arr, 0);
    }
}
