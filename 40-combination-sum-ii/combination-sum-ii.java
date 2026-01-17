class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
    private void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> temp,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            dfs(res,candidates,target-candidates[i],temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}