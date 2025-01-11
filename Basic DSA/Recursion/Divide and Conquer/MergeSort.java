public class MergeSort {

    // Function to perform Merge Sort
    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        // Base case: if the segment has one or no elements, it's already sorted
        if (startIndex >= endIndex) {
            return;
        }

        // Find the middle index to divide the array into two halves
        int midIndex = startIndex + (endIndex - startIndex) / 2;

        // Recursively sort the left half
        mergeSort(array, startIndex, midIndex);

        // Recursively sort the right half
        mergeSort(array, midIndex + 1, endIndex);

        // Merge the two sorted halves
        merge(array, startIndex, endIndex, midIndex);
    }

    // Function to merge two sorted subarrays
    public static void merge(int[] array, int startIndex, int endIndex, int midIndex) {
        // Temporary array to store the merged result
        int[] tempArray = new int[endIndex - startIndex + 1];

        // Pointers to track positions in the left and right subarrays
        int leftPointer = startIndex;
        int rightPointer = midIndex + 1;

        // Index for the temporary array
        int tempIndex = 0;

        // Merge elements from the left and right subarrays
        while (leftPointer <= midIndex && rightPointer <= endIndex) {
            if (array[leftPointer] <= array[rightPointer]) {
                tempArray[tempIndex++] = array[leftPointer++];
            } else {
                tempArray[tempIndex++] = array[rightPointer++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (leftPointer <= midIndex) {
            tempArray[tempIndex++] = array[leftPointer++];
        }

        // Copy any remaining elements from the right subarray
        while (rightPointer <= endIndex) {
            tempArray[tempIndex++] = array[rightPointer++];
        }

        // Copy the sorted elements back into the original array
        for (int i = 0; i < tempArray.length; i++) {
            array[startIndex + i] = tempArray[i];
        }
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    // Main function to test the Merge Sort
    public static void main(String[] args) {
        int[] array = { 6, 3, 9, 5, 2, 8 };

        System.out.println("Original Array:");
        printArray(array);

        // Perform merge sort
        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}