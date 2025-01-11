public class SearchingInSortedMatrix {
    // ? Searches target in a matrix sorted in both row and column order.
    // ? Returns true if the target is found, otherwise false.
    public static boolean findTargetInMatrix(int arr[][], int target) {
        int len = arr.length; // Number of rows in the matrix

        // Handle edge case: empty matrix
        if (len == 0) {
            return false;
        }

        int row = 0; // Start from the top-right corner
        int column = arr[0].length - 1; // Number of columns in the first row (last column index)

        // Traverse the matrix diagonally based on the sorted properties
        while (row < len && column >= 0) {
            if (target == arr[row][column]) {
                return true; // Found the target
            } else if (target < arr[row][column]) {
                column--; // Move left if target is smaller
            } else {
                row++; // Move down if target is larger
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 33; // Change this value to test for other numbers

        // Search for the target and display the result
        System.out.println("Searching for " + target + "...");
        System.out.println(target + (findTargetInMatrix(arr, target) ? " found in matrix!" : " not found in matrix!"));
    }
}
