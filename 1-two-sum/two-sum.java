class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
                return new int[] {i,map.get(target-num)};
            }
            map.put(num,i);
        }
        return new int[]{};
    }
}