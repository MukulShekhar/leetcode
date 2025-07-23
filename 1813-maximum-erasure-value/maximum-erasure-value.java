class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0;
        int n=nums.length;
        int sum=0,maxs=0;
        HashSet<Integer> set=new HashSet<>();
        while(r<n){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            maxs=Math.max(maxs,sum);
            r++;
        }
        return maxs;
    }
}