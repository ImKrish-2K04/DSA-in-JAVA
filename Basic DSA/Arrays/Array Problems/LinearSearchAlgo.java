public class LinearSearchAlgo {
    public static int linearSearch(int arr[], int target) {
        int ind = -1;

        if (arr.length == 0) {
            return ind;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ind = i;
                return ind;
            }
        }

        return ind;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 57, 89, 41, 62, 74, 35 };
        int target = 47;
        
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("target found on " + index + "th index.");
        } else {
            System.out.println("please adjust either your array or target value.");
        }
    }
}
