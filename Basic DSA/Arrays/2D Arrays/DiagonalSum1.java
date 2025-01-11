public class DiagonalSum1 {
    public static void findDiagonalSum(int arr[][]) {
        // Get the length of the matrix (number of rows)
        int len = arr.length;

        // Get the number of columns (assuming it's a square matrix)
        int cols = arr[0].length;

        // Initialize sums for primary and secondary diagonals
        int primaryDiagSum = 0, secondaryDiagSum = 0;

        // Validate if the matrix is square (nxn)
        if (len != cols) {
            System.out.println("Matrix is not nxn");
            return;
        }

        // Traverse each row of the matrix
        for (int row = 0; row < len; row++) {
            // Add the value of the primary diagonal (row == col)
            primaryDiagSum += arr[row][row];

            // Check if the element belongs to the secondary diagonal (top-right to
            // bottom-left)
            if (row != len - row - 1) {
                // Add the value of the secondary diagonal
                secondaryDiagSum += arr[row][len - row - 1];
            }
        }

        // Calculate the total diagonal sum (primary + secondary)
        int diagonalSum = primaryDiagSum + secondaryDiagSum;

        // Print the diagonal sum result
        System.out.println("Diagonal sum: " + diagonalSum);
    }

    public static void main(String[] args) {
        // Sample matrix with even dimensions (nxn matrix)
        int[][] evenArr = {
                { 1, 7, 7, 1 },
                { 6, 2, 2, 6 },
                { 8, 3, 3, 8 },
                { 4, 9, 9, 4 }
        };

        // Sample matrix with odd dimensions (nxn matrix)
        int[][] oddArr = {
                { 1, 4, 1 },
                { 5, 2, 7 },
                { 3, 6, 3 }
        };

        // Sample matrix with different dimensions (nxm matrix)
        int[][] extraUseCase = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        // Call the function to find the diagonal sum for both matrices
        findDiagonalSum(evenArr);
        findDiagonalSum(oddArr);
        findDiagonalSum(extraUseCase);
    }
}
