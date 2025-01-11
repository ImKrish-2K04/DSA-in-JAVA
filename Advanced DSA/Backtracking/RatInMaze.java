public class RatInMaze {

    // Recursive method to find paths through the maze
    public static void solve(int maze[][], int row, int col, int mazeSize, String pathSoFar, int visited[][]) {
        // Dead-end conditions: Out of bounds, blocked cell, or already visited cell
        if (row < 0 || row >= mazeSize || col < 0 || col >= mazeSize || maze[row][col] == 0 || visited[row][col] == 1) {
            return;
        }

        // Base case: If we reach the bottom-right corner, print the path
        if (row == mazeSize - 1 && col == mazeSize - 1) {
            System.out.println("path : " + pathSoFar);
            return;
        }

        // Mark the current cell as visited
        visited[row][col] = 1;

        // Explore all possible directions
        solve(maze, row + 1, col, mazeSize, pathSoFar + "D", visited); // Move Down
        solve(maze, row - 1, col, mazeSize, pathSoFar + "U", visited); // Move Up
        solve(maze, row, col - 1, mazeSize, pathSoFar + "L", visited); // Move Left
        solve(maze, row, col + 1, mazeSize, pathSoFar + "R", visited); // Move Right

        // Backtrack: Unmark the current cell as visited
        visited[row][col] = 0;
    }

    public static void solveMaze(int maze[][]) {
        int mazeSize = maze.length;

        // Validate the maze input
        if (mazeSize == 0 || maze[0][0] == 0 || maze[mazeSize - 1][mazeSize - 1] == 0) {
            System.out.println("Invalid maze is provided!");
            return;
        }

        // Temporary array to track visited cells
        int visited[][] = new int[mazeSize][mazeSize];

        // Start solving the maze from the top-left corner
        solve(maze, 0, 0, mazeSize, "", visited);
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        solveMaze(maze);
    }
}
