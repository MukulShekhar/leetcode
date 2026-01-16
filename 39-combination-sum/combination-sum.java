class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        dfs(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
    private void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> temp,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            dfs(res,candidates,target-candidates[i],temp,i);
            temp.remove(temp.size()-1);
        }
    }
}