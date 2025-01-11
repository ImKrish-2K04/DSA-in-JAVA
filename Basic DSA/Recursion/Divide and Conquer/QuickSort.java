public class QuickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        // Base case: if the segment has one or no elements, it's already sorted
        if (startIndex >= endIndex) {
            return;
        }

        // Partition the array and get the pivot index
        int partitionIndex = partition(array, startIndex, endIndex);

        // Recursively sort the left part of the partition
        quickSort(array, startIndex, partitionIndex - 1);

        // Recursively sort the right part of the partition
        quickSort(array, partitionIndex + 1, endIndex);
    }

    // Function to partition the array
    public static int partition(int[] array, int startIndex, int endIndex) {
        // Choose the pivot as the last element
        int pivot = array[endIndex];

        // Index for the smaller element
        int partitionIndex = startIndex;

        // Compare each element with the pivot
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] <= pivot) {
                // Swap array[i] with array[partitionIndex]
                int temp = array[i];
                array[i] = array[partitionIndex];
                array[partitionIndex] = temp;

                // Move the partition index forward
                partitionIndex++;
            }
        }

        // Place the pivot in its correct position
        int temp = array[partitionIndex];
        array[partitionIndex] = array[endIndex];
        array[endIndex] = temp;

        return partitionIndex;
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    // Main function to test the Quick Sort
    public static void main(String[] args) {
        int[] array = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        printArray(array);

        // Perform quick sort
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}