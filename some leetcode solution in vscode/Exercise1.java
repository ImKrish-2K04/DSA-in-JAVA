public class Exercise1 {
    public static boolean isEvenNoOfDigits(int n) {
        int cnt = 0;

        if (n < 0) {
            n = n * -1;
        }

        while (n > 0) {
            cnt++;
            n /= 10;
        }

        return (cnt % 2 == 0);
    }

    public static void main(String[] args) {
        /*
        ! LEETCODE : `1295.` `Find Numbers with Even Number of Digits`
        
        ! in this exercise we are going to create a program which travers an array and counts the total no. of digits of each elements and check whether the number of digits of that element is even or odd...
        
        ! if number has EVEN no. of digits then print the statement according to it and if ODD no. of digits then also...
         */

        int arr[] = { 12, 345, 2, 6, 7896, -242423 };

        for (int i = 0; i < arr.length; i++) {
            if (isEvenNoOfDigits(arr[i])) {
                System.out.println(arr[i] + " has EVEN no. of digits.");
            } else {
                System.out.println(arr[i] + " has ODD no. of digits.");
            }
        }
    }
}
