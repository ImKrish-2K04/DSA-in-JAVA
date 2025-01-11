public class Learning8 {
    public static int rowMoves[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
    public static int colMoves[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    public static boolean found = false; // Tracks if a solution is found

    public static void printBoard(int board[][]) {
        System.out.println("-- Knight's Tour --");

        for (int arr[] : board) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void knightsTour(int board[][], int r, int c, int n, int counts) {
        // Dead-end check
        if (r < 0 || r >= n || c < 0 || c >= n || board[r][c] != -1) {
            return;
        }

        // Mark this cell as part of the knight's path
        board[r][c] = counts;

        // Base case: Completed tour
        if (counts == n * n - 1) { // All squares visited
            printBoard(board);
            found = true; // Mark solution as found
            return;
        }

        // Recursive exploration of all 8 possible moves
        for (int i = 0; i < 8; i++) {
            int nextRow = r + rowMoves[i];
            int nextCol = c + colMoves[i];
            if (!found) { // Proceed only if no solution is found yet
                knightsTour(board, nextRow, nextCol, n, counts + 1);
            }
        }

        // Backtrack: Reset the cell to unvisited
        board[r][c] = -1;
    }

    public static void main(String[] args) {
        int n = 8; // Chessboard size

        int board[][] = new int[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = -1;
            }
        }

        // Start the knight's tour at the top-left corner
        knightsTour(board, 0, 0, n, 0);

        if (!found) {
            System.out.println("No solution exists");
        }
    }
}