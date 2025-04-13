class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        else if(n==1) return nums[0];
        int[] ss=new int[n];
        ss[0]=nums[0];
        ss[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            ss[i] = Math.max(ss[i - 1], ss[i - 2]+ nums[i]);
        }
        return ss[n-1];
    }
}