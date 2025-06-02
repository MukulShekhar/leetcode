class Solution {
    int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int n=matrix.length;
        int m= matrix[0].length;
        int lp=0;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int longest=longestIP(matrix,dp,n,m,i,j);
                lp=Math.max(lp,longest);
            }
        }
        return lp;
    }
    private int longestIP(int[][] matrix,int[][] dp,int n,int m,int i,int j){
        if(dp[i][j]>0) return dp[i][j];
        int max=0;
        for(int[] dir:direction){
            int x=dir[0]+i,y=dir[1]+j;
            if(x>-1 && y>-1 && x<n && y<m && matrix[x][y]>matrix[i][j]){
                int longest=longestIP(matrix,dp,n,m,x,y);
                max=Math.max(max,longest);
            }
        }
        dp[i][j]=max+1;
        return dp[i][j];
    }
}