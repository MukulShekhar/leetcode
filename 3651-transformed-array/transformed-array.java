class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int k=((i + nums[i]) % n + n) % n;
            res[i]=nums[k];
        }
        return res;
    }
}