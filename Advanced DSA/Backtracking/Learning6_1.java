public class Learning6_1 {
    public static void printBoard(int board[][]) {
        int cnt = 0;

        System.out.println("---------------------");
        for (int i = 0; i < board.length; i++) {
            cnt++;
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
                if ((j + 1) % 3 == 0 && (j + 1) != 9) {
                    System.out.print(" | ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (cnt % 3 == 0) {
                System.out.println("---------------------");
            }
        }
    }

    public static boolean isSafe(int board[][], int row, int col, int digit) {
        // find for the column...
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == digit) {
                return false;
            }
        }

        // find for the row...
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == digit) {
                return false;
            }
        }

        // for the sub-grid...

        int stRow = row - (row % 3);
        int stCol = col - (col % 3);

        for (int r = stRow; r < stRow + 3; r++) {
            for (int c = stCol; c < stCol + 3; c++) {
                if (board[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int board[][], int row, int col) {
        // base case:
        if (row == 9) {
            return true;
        }

        // if all columns are traversed then moves to next row..
        if (col == 9) {
            return sudokuSolver(board, row + 1, 0);
        }

        // if the current cell is already filled then move to next column..
        if (board[row][col] != 0) {
            return sudokuSolver(board, row, col + 1);
        }

        // recursion:
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (sudokuSolver(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int sudoku1[][] = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        // int sudoku2[][] = {
        // { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
        // { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
        // { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
        // { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
        // { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
        // { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
        // { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
        // { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
        // { 0, 0, 0, 0, 8, 0, 0, 7, 8 }
        // };

        if (sudokuSolver(sudoku1, 0, 0)) {
            System.out.println("Solution possible..");
            printBoard(sudoku1);
        } else {
            System.out.println("Solution is not possible..");
        }
    }
}