import java.util.*;

public class Exercise3 {
    // 2965. Find Missing and Repeated Values

    // solution 1:

    public static int[] solution1(int grid[][]) {
        HashSet<Integer> set = new HashSet<>();
        int len = grid.length;
        int temp[] = new int[len * len];
        int ans[] = new int[2];
        int it = 0;

        // filling the temp array first..
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                temp[it++] = grid[i][j];
            }
        }

        // finding the repeating element and pushing into ans arr..
        for (int i = 0; i < temp.length; i++) {
            if (set.contains(temp[i])) {
                ans[0] = temp[i];
            } else {
                set.add(temp[i]);
            }
        }

        // finding the missing element and pushing into ans arr..
        for (int i = 1; i <= temp.length; i++) {
            if (!set.contains(i)) {
                ans[1] = i;
            }
        }

        return ans;
    }

    // solution 2:

    public static int[] solution2(int[][] grid) {
        int len = grid.length;
        int arr[] = new int[len * len + 1];
        int ans[] = new int[2];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[grid[i][j]]++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 1) {
                ans[0] = i;
            } else if (arr[i] < 1) {
                ans[1] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int grid[][] = {
                { 1, 3 },
                { 2, 2 }
        };

        System.out.println(Arrays.toString(solution2(grid)));
    }
}
