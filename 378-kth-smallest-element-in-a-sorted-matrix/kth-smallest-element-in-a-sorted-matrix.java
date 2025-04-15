class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = matrix[0][0];            
        int right = matrix[m - 1][n - 1];   
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = countl(matrix, mid);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    private int countl(int[][] matrix, int target) {
        int count = 0;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] <= target) {
                count += (col + 1);
                row++;
            } else {
                col--; 
            }
        }
        return count;
    }
}
