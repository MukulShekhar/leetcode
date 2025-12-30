class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int count = 0;

        for (int r = 0; r <= rows - 3; r++) {
            for (int c = 0; c <= cols - 3; c++) {

                if (isMagic(grid, r, c)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagic(int[][] g, int r, int c) {

        // Rule 1: Check if numbers are 1-9 and distinct
        boolean[] seen = new boolean[10];
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                int val = g[i][j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        // Rule 2: Center must be 5
        if (g[r+1][c+1] != 5) return false;

        // Check row sums == 15
        for (int i = 0; i < 3; i++) {
            if (g[r+i][c] + g[r+i][c+1] + g[r+i][c+2] != 15) return false;
        }

        // Check column sums == 15
        for (int j = 0; j < 3; j++) {
            if (g[r][c+j] + g[r+1][c+j] + g[r+2][c+j] != 15) return false;
        }

        // Check diagonals
        if (g[r][c] + g[r+1][c+1] + g[r+2][c+2] != 15) return false;
        if (g[r][c+2] + g[r+1][c+1] + g[r+2][c] != 15) return false;

        return true;
    }
}
