class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;        
        List<Integer> res = new ArrayList<>();
        
        int[] visited=new int[n]; 

        for(int i=0; i<n; i++){

            if(visited[i]==0){
                dfs(i, graph, visited);
            }

            if(visited[i]==1){
                res.add(i);
            }
        }
        return res;
    }
    void dfs(int idx, int[][] graph, int[] visited){   

        visited[idx]=2;
        for(int node:graph[idx]){            

            if(visited[node]==0){
                dfs(node, graph, visited);
            }

            if(visited[node]==2){
                return;
            }
        }
         visited[idx]=1;
    }
    
}