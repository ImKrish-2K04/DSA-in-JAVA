public class AllRecursion1 {
    public static void printInc(int n) {
        // Base case: When n is 1, the recursion stops, and we print 1.
        if (n == 1) {
            System.out.println(n); // Print the smallest value (1) as part of the increasing sequence.
            return; // End the current recursion and return to the previous stack frame.
        }

        // Recursive call: Reduces the problem size by calling the method with (n - 1).
        printInc(n - 1);

        // Print the current value after the smaller problem has been solved.
        // This ensures the numbers are printed in increasing order.
        System.out.println(n);
    }

    public static void printDec(int n) {
        // Base case: When n reaches 1, print it and stop recursion.
        if (n == 1) {
            System.out.println(n); // Print the last number (1) in the decreasing sequence.
            return; // Exit the current stack frame to stop further recursive calls.
        }

        // Print the current number before making the recursive call.
        // This ensures numbers are printed in decreasing order.
        System.out.println(n);

        // Recursive call: Reduce the problem size by decreasing n by 1.
        printDec(n - 1);
    }

    public static int factorial(int n) {
        // Base case: Factorial of 0 is 1.
        if (n == 0) {
            return 1; // End recursion and return the value 1.
        }

        // Recursive case: Multiply current number (n) with factorial of (n - 1).
        int fct = n * factorial(n - 1);

        // Return the computed factorial value for the current n.
        return fct;
    }

    public static int sumOfNnums(int n) {
        // Base case: When n is 1, return 1 as the sum of the first number.
        if (n == 1) {
            return 1; // Stops recursion and starts returning sums back up the call stack.
        }

        // Recursive case: Add current (n) to the sum of numbers from 1 to (n - 1).
        int sum = n + sumOfNnums(n - 1);

        // Return the computed sum for the current call.
        return sum;
    }

    public static int fibonacci(int n) {
        // Base case: If n is 0 or 1, return n (F(0) = 0, F(1) = 1).
        if (n == 1 || n == 0) {
            return n; // Returns 0 for F(0) or 1 for F(1).
        }

        // Recursive case: Calculate the two previous Fibonacci numbers.
        int fibnm1 = fibonacci(n - 1); // Fibonacci of (n-1)
        int fibnm2 = fibonacci(n - 2); // Fibonacci of (n-2)

        // The Fibonacci number is the sum of the two preceding ones.
        int fibn = fibnm1 + fibnm2;

        // Return the calculated Fibonacci number for the current n.
        return fibn;
    }

    public static boolean isArrSorted(int arr[], int i) {
        // Base case: When i reaches the second-last element, return true (end of array
        // is reached).
        if (i == arr.length - 1) {
            return true; // Array is considered sorted up to this point.
        }

        // Check if the current element is greater than the next one.
        // If it is, the array is not sorted, so return false.
        if (arr[i] > arr[i + 1]) {
            return false; // Array is not sorted if the current element is greater than the next.
        }

        // Recursive case: Move to the next element and check again.
        return isArrSorted(arr, i + 1);
    }

    public static int findFirstOccurrence(int arr[], int key, int i) {
        // Base case: If i reaches the end of the array, return -1 (key not found).
        if (i == arr.length) {
            return -1; // The key is not present in the array.
        }

        // If the current element matches the key, return the index.
        if (arr[i] == key) {
            return i; // Return the index where the key is found.
        }

        // Recursive case: Move to the next element and search for the key.
        return findFirstOccurrence(arr, key, i + 1);
    }

    public static int findLastOccurrence(int arr[], int key, int i) {
        // Base case: If i is -1, the key is not found, return -1.
        if (i == -1) {
            return i; // If index reaches -1, return -1 (key not found).
        }

        // If the current element matches the key, return the index.
        if (arr[i] == key) {
            return i; // Return the index of the last occurrence of the key.
        }

        // Recursive case: Continue searching by calling the function with i - 1.
        return findLastOccurrence(arr, key, i - 1);
    }

    public static int findPower(int x, int n) {
        // Base case: If the exponent is 1, return x (x^1 = x).
        if (n == 1) {
            return x; // When n is 1, return x itself, as x^1 = x.
        }

        // Recursive case: Multiply x by the result of x raised to the power of (n - 1).
        return (x * findPower(x, n - 1)); // Recursively compute x^n as x * x^(n-1).
    }

    public static int optimized_findPower(int x, int n) {
        // Base case: If exponent is 0, return 1 (x^0 = 1).
        if (n == 0) {
            return 1; // x^0 is 1 for any x.
        }

        else {
            // Recursively compute x^(n / 2) to reduce the problem size.
            int power = optimized_findPower(x, n / 2);

            // Square the result of x^(n / 2).
            int result = power * power;

            // If n is odd, multiply the result by x to account for the extra factor.
            if (n % 2 != 0) {
                result *= x; // For odd exponents, multiply by x to get the correct power.
            }

            // Return the computed result (x^n).
            return result;
        }
    }

    // optimized fibonacci code using arrays..
    public static int findFib_term(int n, int[] arr) {
        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // If value is already calculated, return it
        if (arr[n] != 0) {
            return arr[n];
        }

        // Calculate and store the value
        arr[n] = findFib_term(n - 1, arr) + findFib_term(n - 2, arr);
        return arr[n];
    }

    public static void main(String[] args) {
        int num = 5;

        // func1
        System.out.println("Function 1:");
        printDec(num);

        // func2
        System.out.println("Function 2:");
        printInc(num);

        // func3
        System.out.println("Function 3:");
        System.out.println("Factorial of " + num + ": " + factorial(num));

        // func4
        System.out.println("Function 4:");
        System.out.println("sum of first " + num + " natural nums: " + sumOfNnums(num));

        // func5
        System.out.println("Function 5:");
        System.out.println("number present at " + num + "th index of fib. series is: " + fibonacci(num));

        // func6
        System.out.println("Function 6:");
        int arr[] = { 1, 2, 3, 10, 4, 5 };
        if (isArrSorted(arr, 0)) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

        // func7
        System.out.println("Function 7:");
        int arr2[] = { 5, 1, 56, 34, 55, 13, 4, 15, 34 };
        int key = 34;
        int result = findFirstOccurrence(arr2, key, 0);

        if (result != -1) {
            System.out.println("found at index: " + result);
        } else {
            System.out.println("value is not found!");
        }

        // func8
        System.out.println("Function 8:");
        int arr3[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key2 = 5;
        int i = arr.length - 1;

        int result2 = findLastOccurrence(arr3, key2, i);
        if (result2 != -1) {
            System.out.println("found at index: " + result2);
        } else {
            System.out.println("value is not found!");
        }

        int x = 2, pow = 10;
        // func 9 and 10 respectively
        System.out.println("Function 9:");
        System.out.println(x + " to the power " + pow + " is: " + findPower(x, pow));
        System.out.println("Function 10:");
        System.out.println(x + " to the power " + pow + " is: " + optimized_findPower(x, pow));
    }
}