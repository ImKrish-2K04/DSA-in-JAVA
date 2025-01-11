public class Learning5_1 {
    // Grid ways...
    public static int gridWays(int grid[][], int row, int col) {
        // base case:
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        } else if (row >= grid.length || col >= grid[0].length) {
            return 0;
        }

        // recursion:

        // moving to right..
        int way1 = gridWays(grid, row, col + 1);
        // moving to bottom..
        int way2 = gridWays(grid, row + 1, col);
        // returning total ways..
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 3, m = 4;
        int grid[][] = new int[n][m];
        int totalWays = gridWays(grid, 0, 0);
        System.out.println("Total ways for moving from start to end are: " + totalWays);
    }
}
