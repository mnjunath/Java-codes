// The goal is to find the minimum path sum from the top-left to the bottom-right of a 2D grid, where each cell contains a non-negative //number. You can only move either right or down at any point in time. The challenge is to compute the path that results in the smallest //possible total sum, using an efficient dynamic programming approach. This generalized solution also allows customization for similar //problems like maximum path sum or other cost-based grid traversal tasks.







import java.util.function.BiFunction;

class GridSolver {

    // Generalized DP for a 2D grid
    public static int solve(int[][] grid, BiFunction<Integer, Integer, Integer> combiner) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                else if (i == 0) grid[i][j] = combiner.apply(grid[i][j], grid[i][j - 1]);
                else if (j == 0) grid[i][j] = combiner.apply(grid[i][j], grid[i - 1][j]);
                else grid[i][j] = combiner.apply(grid[i][j], Math.min(grid[i - 1][j], grid[i][j - 1]));
            }
        }

        return grid[m - 1][n - 1];
    }
}
