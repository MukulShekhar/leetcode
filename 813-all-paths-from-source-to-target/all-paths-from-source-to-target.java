class Solution {
    public void dfs(int[][] graph,int node,List<List<Integer>> res,List<Integer> path,boolean[] vis,int dest){
        if(vis[node]){
            return;
        }
        vis[node]=false;
        path.add(node);
        if(node==dest){
            List<Integer> temp=new ArrayList<>();
            for(int i:path){
                temp.add(i);
            }
            res.add(temp);
        }
        for(int i:graph[node]){
            dfs(graph,i,res,path,vis,dest);
        }
        vis[node]=false;
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] vis=new boolean[n];
        dfs(graph,0,res,path,vis,n-1);
        return res;
    }
}