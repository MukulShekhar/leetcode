class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int neg=0;
        int mabs=Integer.MAX_VALUE;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=matrix[i][j];
                if(val<0) neg++;
                int absv=Math.abs(val);
                mabs=Math.min(mabs,absv);
                sum+=absv;
            }
        }
        if(neg%2==1){
            sum-=2L*mabs;
        }
        return sum;
    }
}