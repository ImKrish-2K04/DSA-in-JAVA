public class FindMaxValue {
    public static void findMaxValue(int arr[]) {
        int max = 0;

        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("maximum number in array is: " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 23, 57, 89, 41, 62, 74, 35 };
        findMaxValue(arr);
    }
}
