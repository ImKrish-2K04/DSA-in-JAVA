public class TilingProblem {
    // Recursive function to solve the tiling problem
    public static int tilingProblem(int n) {
        // Base case: A 2x0 or 2x1 board has exactly 1 way to tile
        if (n == 0 || n == 1) {
            return 1;
        }

        // Aligning a tile vertically reduces the board width by 1
        int nm1 = tilingProblem(n - 1);

        // Aligning a tile horizontally reduces the board width by 2
        int nm2 = tilingProblem(n - 2);

        // Total ways are the sum of vertical and horizontal placements
        int totalWays = nm1 + nm2;

        // Return total ways to the previous call
        return totalWays;
    }

    public static void main(String[] args) {
        int breadth = 4; // Define the board width (2x4 in this case)
        int ways = tilingProblem(breadth); // Calculate total ways to tile the board
        System.out.println("Total ways to fit 2x1 tiles in 2x" + breadth + " board: " + ways);
    }
}
