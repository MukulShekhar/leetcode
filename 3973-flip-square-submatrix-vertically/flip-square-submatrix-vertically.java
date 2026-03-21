class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=0;i<k/2;i++){
            int tr=x+i;
            int br=x+k-1-i;
            for(int j=y;j<y+k;j++){
                int tmp=grid[tr][j];
                grid[tr][j]=grid[br][j];
                grid[br][j]=tmp;
            }
        }
        return grid;
    }
}