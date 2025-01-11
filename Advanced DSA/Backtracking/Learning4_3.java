public class Learning4_3 {
    public static boolean isSafe(char board[][], int row, int col) {
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }

        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        for (int r = row - 1, c = col + 1; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("- CHESS BOARD -");

        for (char arr[] : board) {
            for (char val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean nQueens(char board[][], int row) {
        if (row == board.length) {
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = 'X';
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 3;

        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println(".. Solution is possible ..");
            printBoard(board);
        } else {
            System.out.println(".. Solutions is not possible ..");
        }
    }
}
