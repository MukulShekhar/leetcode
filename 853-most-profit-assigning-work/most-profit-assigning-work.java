class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        int[][] ar=new int[n][2];
        for(int i=0;i<n;i++){
            ar[i][0]=difficulty[i];
            ar[i][1]=profit[i];
        }
        Arrays.sort(ar,(a,b)->Integer.compare(a[0],b[0]));
        Arrays.sort(worker);
        int ps=0,mp=0,j=0;
        for(int k:worker){
            while(j<n && k>=ar[j][0]){
                mp=Math.max(mp,ar[j][1]);
                j++;
            }
            ps+=mp;
        }
        return ps;
    }
}