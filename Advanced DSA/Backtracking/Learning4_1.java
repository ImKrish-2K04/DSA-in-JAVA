public class Learning4_1 {
    public static boolean isSafe(char board[][], int row, int col) {
        // Check column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("*************");
        System.out.println(" CHESS BOARD ");
        System.out.println("*************");
        System.out.println();

        for (char[] row : board) {
            for (char cell : row) {
                if (cell == 'Q') {
                    System.out.print(" Q "); // Unicode symbol for Queen
                } else {
                    System.out.print(" . "); // Empty cell
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*************");
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Change this to the desired size
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }
}
