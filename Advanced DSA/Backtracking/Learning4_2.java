public class Learning4_2 {
    public static int count = 0;

    public static boolean isSafe(char board[][], int r, int c) {
        // same-col top
        for (int row = r - 1; row >= 0; row--) {
            if (board[row][c] == 'Q') {
                return false;
            }
        }

        // upper-left diagonal
        for (int row = r - 1, col = c - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 'Q') {
                return false;
            }
        }

        // upper-right diagonal
        for (int row = r - 1, col = c + 1; row >= 0 && col < board.length; row--, col++) {
            if (board[row][col] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            count++;
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

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // call the nQueens method...

        nQueens(board, 0);

        // print how many possibilities for placing n queens in the board of nxn

        System.out.println(
                "There are total " + count + " possibilities for " + n + " Queens in " + n + "X" + n + " board.");
    }
}
