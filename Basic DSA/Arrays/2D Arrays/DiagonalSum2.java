public class DiagonalSum2 {
    // This method calculates and prints the sum of both diagonals of a square
    // matrix
    public static void findDiagonalSum(int arr[][]) {
        // Initialize the sum variable to hold the result
        int sum = 0;
        // Get the length of the matrix (rows and columns)
        int len = arr.length;

        // Traverse each row of the matrix
        for (int i = 0; i < len; i++) {
            // Add the primary diagonal element (row == column)
            sum += arr[i][i];

            // Add the secondary diagonal element (row + column == len - 1)
            // Ensure the center element (for odd-sized matrices) is not counted twice
            if (i != len - i - 1) {
                sum += arr[i][len - i - 1];
            }
        }

        // Print the final diagonal sum
        System.out.println("The diagonal sum of a " + len + "x" + len + " matrix is: " + sum);
    }

    public static void main(String[] args) {
        // Example matrix with even dimensions (4x4)
        int[][] evenArr = {
                { 1, 7, 7, 1 },
                { 6, 2, 2, 6 },
                { 8, 3, 3, 8 },
                { 4, 9, 9, 4 }
        };

        // Example matrix with odd dimensions (3x3)
        int[][] oddArr = {
                { 1, 4, 1 },
                { 5, 2, 7 },
                { 3, 6, 3 }
        };

        // Call the function to calculate and print the diagonal sum for both matrices
        findDiagonalSum(evenArr);
        findDiagonalSum(oddArr);
    }
}
