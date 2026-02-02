class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;
        int u=1;
        int d=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                u=d+1;
            }else if(nums[i]<nums[i-1]){
                d=u+1;
            }
        }
        return Math.max(u,d);
    }
}