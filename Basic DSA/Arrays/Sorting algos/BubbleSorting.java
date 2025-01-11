import java.util.Arrays;

public class BubbleSorting {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int swap;

        // we runs less than (n-1) iterations, because on (n-1)th iteration, our array will be sorted!
        for (int i = 0; i < n - 1; i++) {
            swap = 0;
            // we runs loop less than (n-1-i) times, because in this method the array will be sorted from (n-1-i)'th index to (n-1)'th index...

            for (int j = 0; j < n - 1 - i; j++) {
                // if any value is bigger found on current index than next index, we will swap those values...
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0)
                break;
        }

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
    }
}
