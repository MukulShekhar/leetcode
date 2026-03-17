class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]+=matrix[i-1][j];
                }
            }
        }
        int ma=0;
        for(int i=0;i<n;i++){
            int[] r=matrix[i].clone();
            Arrays.sort(r);
            for(int j=m-1;j>=0;j--){
                int h=r[j];
                int w=m-j;
                ma=Math.max(ma,h*w);
            }
        }
        return ma;
    }
}