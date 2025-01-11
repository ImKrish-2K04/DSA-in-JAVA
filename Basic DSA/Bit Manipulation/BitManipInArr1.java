public class BitManipInArr1 {
    public static void main(String[] args) {
        // if we are given by a repeating elements array and we have to find only
        // non-repeating element of array using bit-wise operators then how??
        int arr[] = { 5, 4, 1, 9, 4, 3, 3, 5, 1 };
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result + " is only non repeating element in an array!");
    }
}
