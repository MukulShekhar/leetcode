class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] rc=new int[n];
        int[] cc=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    rc[i]++;
                    cc[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && rc[i]==1 && cc[j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}