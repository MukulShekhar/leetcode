class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
       long sum=0;
       int idx=happiness.length-1;
       for(int i=0;i<k;i++){
        int val=happiness[idx]-i;
        if(val<=0) break;
        sum+=val;
        idx--;
       }
       return sum;
    }
}