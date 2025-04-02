class Solution {
    private int dfs(int current,Map<Integer,List<Integer>> tree,int[] informTime){
        if(!tree.containsKey(current)){
              return 0;
        }
        int mT=0;
        for(int i:tree.get(current)){
            mT=Math.max(mT,dfs(i,tree,informTime));
        }
        return informTime[current]+mT;
    }
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer,List<Integer>> tree=new HashMap<>();
        for(int i=0;i<n;i++){
            tree.putIfAbsent(manager[i],new ArrayList<>());
            tree.get(manager[i]).add(i);
        }
        return dfs(headID,tree,informTime);
    }
}