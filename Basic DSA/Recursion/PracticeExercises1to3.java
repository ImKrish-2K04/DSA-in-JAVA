public class PracticeExercises1to3 {
    // Array to convert digits to their corresponding word representation
    public static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    // Q1: Find and print all indices where a target element exists in the array
    public static void question1(int arr[], int target, int ind) {
        // Base case: If index exceeds array length, terminate recursion
        if (ind == arr.length) {
            return;
        }

        // If the target element is found, print its index
        if (arr[ind] == target) {
            System.out.print(ind + " ");
        }

        // Recursive call to check the next index
        question1(arr, target, ind + 1);
    }

    // Q2: Recursively print each digit of an integer in words (e.g., "one nine four
    // zero")
    public static void question2(int value, int cnt) {
        // Base case: If the value becomes zero, stop recursion
        if (value == 0) {
            return;
        }

        // Extract the last digit of the number
        int rem = value % 10;

        // Handle edge case: Prevent "zero" as the last digit output
        if (cnt == 0 && rem == 0) {
            System.out.println("Last digit can't be a zero");
            return;
        }

        // Recursive call to process the rest of the digits
        question2(value / 10, cnt + 1);

        // Print the word for the current digit (in reverse order due to recursion)
        System.out.print(arr[rem] + " ");
    }

    // Q3: Calculate the length of a string using recursion (without using
    // str.length())
    public static int question3(String str) {
        // Base case: If the string is empty, return length as 0
        if (str.length() == 0) {
            return 0;
        }

        // Recursive call: Reduce the string and add 1 to the result
        return question3(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        // Q1: Find and print all indices of '2' in the array
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int target = 2;
        question1(arr, target, 0);
        System.out.println();

        // Q2: Print digits of 1940 in words (e.g., "one nine four zero")
        int value = 1940;
        question2(value, 0);

        // Q3: Calculate and print the length of the string "Krishna"
        String str = "Krishna";
        System.out.println("Length: " + question3(str));
    }
}
