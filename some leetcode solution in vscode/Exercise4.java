import java.util.Arrays;

// leetcode - 88. Merge Sorted Array

public class Exercise4 {
    public static void merge(int num1[], int num2[], int n, int m) {
        // we are going to use a 2-pointers approach here..

        // 'i' is pointing to the indices of num1 array..
        int i = n - 1;
        // 'j' is pointing to the indices of num2 array..
        int j = m - 1;
        // 'k' is a variable which tracks the size of the num1 array after merging..
        int k = n + m - 1;

        // remember, 'k' is also a pointer,
        // it is not pointing to any array in specific,
        // but it is tracking the indices of the num1 array...

        // traversing both the arrays
        // selecting the largest element of both
        // putting on the edge of the num1 array
        // and resetting the pointers..

        while (i >= 0 && j >= 0) {
            // comparing the edge elements of both the arrays..

            // if num1's is big, then its element will be pushed...
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--]; // indices are also decreasing as they are used...
            } else { // else num2's will be pushed...
                num1[k--] = num2[j--];
            }
        }

        // now, if we have traversed whole the num1 array
        // but the num2 is still have some elements
        // because it is still have smaller elements in it
        // then we will add those elements to our num1 array in initial indices..

        while (j >= 0) {
            num1[k--] = num2[j--];
        }

        // printing our num1 array to see is it actually worked or not!
        System.out.println(Arrays.toString(num1));

    }

    public static void main(String[] args) {
        // actual size of the array is 6
        // but the trailing 0's are for just replacements...
        // so the size of the array is considered as 3, becuase 3 elements are there..
        int num1[] = { 1, 2, 3, 0, 0, 0 };

        // this array has total 3 elements only, so its size is 3..
        int num2[] = { 2, 5, 6 };

        // calling the merge() by passing the arrays and their respective sizes..
        merge(num1, num2, 3, 3);
    }
}
