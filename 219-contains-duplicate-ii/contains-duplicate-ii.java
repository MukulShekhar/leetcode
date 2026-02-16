class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0){
            return false;
        }
        Map<Integer,Integer> ma=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int z=nums[i];
            if(ma.containsKey(z) && i-ma.get(z)<=k){
                return true;
            }
            ma.put(z,i);
        }
        return false;
    }
}