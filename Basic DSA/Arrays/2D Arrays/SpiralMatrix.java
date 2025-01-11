public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]) {
        // Length of the matrix
        int len = arr.length;

        // Initial boundary values for rows and columns
        int startRow = 0, endRow = len - 1, startCol = 0, endCol = arr[0].length - 1;

        // Loop until the whole matrix is processed
        while (startRow <= endRow && startCol <= endCol) {

            // Traverse top row (left to right)
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // Traverse right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Traverse bottom row (right to left)
            for (int i = endCol - 1; i >= startCol; i--) {
                // Prevent duplicate printing for a single row
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }

            // Traverse left column (bottom to top)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // Prevent duplicate printing for a single column
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            // Move boundaries inward for the next layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        // Sample 4x4 matrix
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Call the spiralMatrix function to print the matrix in spiral order
        spiralMatrix(arr);
    }
}
