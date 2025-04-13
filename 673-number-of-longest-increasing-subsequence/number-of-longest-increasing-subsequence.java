class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length==1) return 1;
        int dp[] = new int[nums.length];
        int cnt[] = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        int max = 0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]&&1+dp[j]>dp[i]){
                    dp[i] = 1+dp[j];
                    cnt[i] = cnt[j];
                }
                else if(nums[j]<nums[i]&&1+dp[j]==dp[i]){
                    cnt[i]=cnt[i]+cnt[j];
                }
            }
            max = Math.max(max,dp[i]);
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(max==dp[i]) res = res+cnt[i];
        }
        return res;
    }
}