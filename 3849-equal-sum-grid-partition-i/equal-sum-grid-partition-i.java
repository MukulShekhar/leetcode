class Solution {
    int n,m;
    public boolean canPartitionGrid(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        return cv(grid) || ch(grid);
    }
    boolean ch(int[][] grid){
        HashSet<Long> set=new HashSet<>();
        long pre=0;
        for(int i=0;i<n;i++){
            long rows=0;
            for(int j=0;j<m;j++){
                rows+=grid[i][j];
            }
            pre+=rows;
            set.add(pre);
        }
        if(pre%2!=0) return false;
        return set.contains(pre/2);
    }
    boolean cv(int[][] grid){
        HashSet<Long> set=new HashSet<>();
        long pre=0;
        for(int j=0;j<m;j++){
            long cols=0;
            for(int i=0;i<n;i++){
                cols+=grid[i][j];
            }
            pre+=cols;
            set.add(pre);
        }
        if(pre%2!=0) return false;
        return set.contains(pre/2);    
    }
}