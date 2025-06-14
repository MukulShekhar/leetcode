class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        else if(n==1) return nums[0];
        else if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(robbing(nums,0,n-2),robbing(nums,1,n-1));
    }
    private int robbing(int[] nums,int s,int e){
        int len=e-s+1;
        int[] dp=new int[len];
        dp[0]=nums[s];
        if(len>=2) dp[1]=Math.max(nums[s],nums[s+1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[s+i]);
        }
        return dp[len-1];
    }
}