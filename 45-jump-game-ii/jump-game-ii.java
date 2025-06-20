class Solution {
    public int jump(int[] nums) {
          int totalj=0;
          int n=nums.length;
          int dest=n-1;
          int lastjin=0,coverage=0;
          if(n==1) return 0;
          for(int i=0;i<n-1;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastjin){
                lastjin=coverage;
                totalj++;
                if(coverage>=dest){
                return totalj;
            }
            }
          }
          return totalj;     
    }
}