class Solution {
    public int longestSubarray(int[] nums) {
        int prev=0,cur=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
            }else{
                ans=Math.max(ans,prev+cur);
                prev=cur;
                cur=0;
            }
            ans=Math.max(ans,prev+cur);
        }
        return ans==nums.length ? ans-1:ans;
    }
}