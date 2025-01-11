import java.util.Arrays;

public class ArrayReverse {
    // not taking any other array!
    // not taking extra variable for swap!

    public static void arrayReverse(int arr[]) {
        int st = 0, end = arr.length - 1;
        System.out.println("array before reversing: " + Arrays.toString(arr));
        while (st < end) {
            arr[st] = arr[st] ^ arr[end];
            arr[end] = arr[st] ^ arr[end];
            arr[st] = arr[st] ^ arr[end];
            st++;
            end--;
        }
        System.out.println("array after reversing: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        arrayReverse(arr);
    }
}
