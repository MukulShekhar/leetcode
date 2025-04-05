class Solution {
    public int dfs(int[][] grid,int i,int j,int cnt){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0){
            return cnt;
        }
        grid[i][j]=0;
        int a=dfs(grid,i,j-1,0);
        int b=dfs(grid,i-1,j,0);
        int c=dfs(grid,i,j+1,0);
        int d=dfs(grid,i+1,j,0);
        return 1+a+b+c+d;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int cnt=dfs(grid,i,j,0);
                    res=Math.max(cnt,res);
                }
            }
        }
        return res;
    }
}