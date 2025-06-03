class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),nums,0);
        return res;
    }
    private void bt(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            bt(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}