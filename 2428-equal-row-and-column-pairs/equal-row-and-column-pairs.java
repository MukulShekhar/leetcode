class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(GRTC(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean GRTC(int[][] grid,int row,int col){
        int n=grid.length;
        for(int i=0;i<n;i++){
            if(grid[row][i]!=grid[i][col]){
                return false;
            }
        }
        return true;
    }
}