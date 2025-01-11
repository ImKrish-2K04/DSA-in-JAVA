import java.util.ArrayList;
// ! RAT IN THE MAZE PROBLEM...
public class Learning7 {
    public static void solveMaze(int m[][], int r, int c, int size, String path, ArrayList<String> str) {
        // dead-ends:

        if (r < 0 || r >= size || c < 0 || c >= size || m[r][c] == 0 || m[r][c] == -1) {
            return;
        }

        // base-case:

        if (r == size - 1 && c == size - 1) {
            str.add(path);
            return;
        }

        // recursion:

        // ! setting the current cell as visited by assigning -1 to it...
        m[r][c] = -1;

        // ! goes down
        solveMaze(m, r + 1, c, size, path + "D", str);

        // ! goes up
        solveMaze(m, r - 1, c, size, path + "U", str);

        // ! goes left
        solveMaze(m, r, c - 1, size, path + "L", str);

        // ! goes right
        solveMaze(m, r, c + 1, size, path + "R", str);

        // ! if you've completed all 4 dirs. then coming here after backtrackings...

        // ! resetting the current cell with 1...
        m[r][c] = 1;
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 1, 0, 1 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 }
        };

        if (maze[0][0] == 0 || maze[maze.length - 1][maze.length - 1] == 0) {
            System.out.println("Incorrect maze...");
            return;
        }

        ArrayList<String> paths = new ArrayList<>();

        solveMaze(maze, 0, 0, maze.length, "", paths);

        if (paths.isEmpty()) {
            System.out.println("No paths found!");
        } else {
            System.out.println("Path found..");
            int cnt = 1;
            for (String str : paths) {
                System.out.println("Path " + cnt + " : " + str);
                cnt++;
            }
        }
    }
}
