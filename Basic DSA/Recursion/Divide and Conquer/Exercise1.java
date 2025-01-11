import java.util.Arrays;

public class Exercise1 {
    // Utility function to print the elements of the array
    public static void printArray(String arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    // Recursive function to perform Merge Sort on the array
    public static void mergeSort(String arr[], int stInd, int endInd) {
        // Base case: if the segment has one or no elements, it's already sorted
        if (stInd >= endInd) {
            return;
        }

        // Find the middle index to divide the array into two halves
        int midInd = stInd + (endInd - stInd) / 2;

        // Recursively sort the left half of the array
        mergeSort(arr, stInd, midInd);

        // Recursively sort the right half of the array
        mergeSort(arr, midInd + 1, endInd);

        // Merge the two sorted halves back into a single sorted segment
        merge(arr, stInd, endInd, midInd);
    }

    // Function to merge two sorted halves of the array
    public static void merge(String arr[], int stInd, int endInd, int midInd) {
        // Temporary array to hold the merged and sorted elements
        String tempArray[] = new String[endInd - stInd + 1];

        // Pointers to track the current index of left, right, and temp arrays
        int leftPointer = stInd, rightPointer = midInd + 1, tempInd = 0;

        // Compare elements from the left and right halves and merge them in order
        while (leftPointer <= midInd && rightPointer <= endInd) {
            if (arr[leftPointer].compareTo(arr[rightPointer]) <= 0) {
                // Left element is smaller or equal, add it to the temporary array
                tempArray[tempInd++] = arr[leftPointer++];
            } else {
                // Right element is smaller, add it to the temporary array
                tempArray[tempInd++] = arr[rightPointer++];
            }
        }

        // Copy any remaining elements from the left half, if any
        while (leftPointer <= midInd) {
            tempArray[tempInd++] = arr[leftPointer++];
        }

        // Copy any remaining elements from the right half, if any
        while (rightPointer <= endInd) {
            tempArray[tempInd++] = arr[rightPointer++];
        }

        // Copy the merged and sorted elements back to the original array
        for (int i = 0; i < tempArray.length; i++) {
            arr[i + stInd] = tempArray[i];
        }
    }

    public static void main(String[] args) {
        // Initialize the string array to be sorted
        String planets[] = { "sun", "earth", "mars", "mercury" };

        // Print the array before sorting
        System.out.println("Before sorting:");
        printArray(planets);

        // Perform Merge Sort on the array
        mergeSort(planets, 0, planets.length - 1);

        // Print the array after sorting
        System.out.println("After sorting:");
        printArray(planets);
    }
}
