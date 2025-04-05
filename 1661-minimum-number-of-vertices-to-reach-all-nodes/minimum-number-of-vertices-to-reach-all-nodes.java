class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] vis=new boolean[n];
        for(List<Integer> s:edges){
            vis[s.get(1)]=true;
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                res.add(i);
            }
        }
        return res;
    }
}