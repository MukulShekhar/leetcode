class Solution {
    public int maxSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            }
        int maxs=0;
        for(Integer ele:set){
            if(ele>0){
                maxs+=ele;
            }
        }
        if(maxs==0){
            maxs=Collections.max(set);
        }
        return maxs;
    }
}