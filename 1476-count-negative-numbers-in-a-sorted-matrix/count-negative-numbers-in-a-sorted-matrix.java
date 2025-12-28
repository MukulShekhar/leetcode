class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;        // → Get number of rows
        int cols = grid[0].length;     // → Get number of columns
        int count = 0;                 // → Initialize counter
        int row = 0;                   // → Start from first row
        int col = cols - 1;            // → Start from last column (top-right corner)
        
        while (row < rows && col >= 0) {  // → While within grid boundaries
            if (grid[row][col] < 0) {     // → If current element is negative
                count += (rows - row);    // → Add all rows below to count
                col--;                    // → Move left to previous column
            } else {
                row++;                    // → Move down to next row
            }
        }
        
        return count;  // → Return total count
    }
}