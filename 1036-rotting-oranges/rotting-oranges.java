class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] time = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                time[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, time, i, j, 0);
                }
            }
        }

        int maxTime = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (time[i][j] == Integer.MAX_VALUE) {
                        return -1;
                    }
                    maxTime = Math.max(maxTime, time[i][j]);
                }
            }
        }
        return maxTime;
    }

    private void dfs(int[][] grid, int[][] time, int r, int c, int t) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols) return;
        if (grid[r][c] == 0) return;
        if (t >= time[r][c]) return;

        time[r][c] = t;

        dfs(grid, time, r + 1, c, t + 1);
        dfs(grid, time, r - 1, c, t + 1);
        dfs(grid, time, r, c + 1, t + 1);
        dfs(grid, time, r, c - 1, t + 1);
    }
}
