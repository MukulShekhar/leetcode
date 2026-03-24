class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod=12345;
        int n=grid.length;
        int m=grid[0].length;
        int size=n*m;
        long[] arr=new long[size];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=grid[i][j];
            }
        }
        long[] pre=new long[size];
        pre[0]=1;
        for(int i=1;i<size;i++){
            pre[i]=(pre[i-1]*arr[i-1])%mod;
        }
        long[] suf=new long[size];
        suf[size-1]=1;
        for(int i=size-2;i>=0;i--){
            suf[i]=(suf[i+1]*arr[i+1])%mod;
        }
        int[][] p=new int[n][m];
        idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                p[i][j]=(int)(pre[idx]*suf[idx])%mod;
                idx++;
            }
        }
        return p;
    }
}