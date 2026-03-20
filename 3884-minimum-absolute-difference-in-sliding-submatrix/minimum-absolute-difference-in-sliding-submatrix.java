class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n-k+1][m-k+1];
        for(int i=0;i<=n-k;i++){
            for(int j=0;j<=m-k;j++){
                List<Integer> list = new ArrayList<>();
                   for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        list.add(grid[x][y]);
                    }
                }
                 Collections.sort(list);
                  int minDiff = Integer.MAX_VALUE;
                for (int p = 1; p < list.size(); p++) {
                     if (list.get(p).equals(list.get(p - 1))) continue;
                    int diff = list.get(p) - list.get(p - 1);
                    minDiff = Math.min(minDiff, diff);
                    if(minDiff==0) break;
                }
                ans[i][j] = (minDiff == Integer.MAX_VALUE) ? 0 : minDiff;
            }
        }
        return ans;
    }
}