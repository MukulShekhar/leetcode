class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(i,0,color,graph)){
                    return false;
                }
            }
        } 
        return true;
    }
    public boolean dfs(int node,int col,int[] color,int[][] graph){
        color[node]=col;
        for(int n:graph[node]){
            if(color[n]==-1){
                if(!dfs(n,1-col,color,graph)){
                    return false;
                }
            }else if(color[n]==col){
                return false;
            }
        }
        return true;
    }
}