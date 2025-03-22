public class Exercise5 {
    // leetcode problem: 744 OR smallest letter greater than the target
    
    public static char nextGreatestLetter(char arr[], char target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return arr[st % arr.length];
    }

    public static void main(String[] args) {
        char arr[] = { 'c', 'f', 'j' };
        System.out.println("Letter: " + nextGreatestLetter(arr, 'l'));
    }
}