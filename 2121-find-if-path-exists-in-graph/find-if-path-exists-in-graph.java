class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] vis=new boolean[n];
        return dfs(adj,vis,source,destination);
    }
    public boolean dfs(List<List<Integer>> adj,boolean[] vis,int curr,int end){
        if(curr==end){
            return true;
        }
        if(vis[curr]){
            return false;
        }
        vis[curr]=true;
        for(int nbr:adj.get(curr)){
            if(dfs(adj,vis,nbr,end)){
                return true;
            }
        }
        return false;
    }
}