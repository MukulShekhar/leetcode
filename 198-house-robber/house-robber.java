class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        else if(n==1) return nums[0];
        int[] ms=new int[n];
        ms[0]=nums[0];
        ms[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            ms[i] = Math.max(ms[i - 1], ms[i - 2]+ nums[i]);
        }
        return ms[n-1];
    }
}