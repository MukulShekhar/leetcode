class Solution {

    public void dfs(int[][] graph, int node, List<List<Integer>> res, List<Integer> path, int dest){

        path.add(node);

        if(node == dest){
            res.add(new ArrayList<>(path));
        } 
        else{
            for(int nei : graph[node]){
                dfs(graph, nei, res, path, dest);
            }
        }

        path.remove(path.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(graph, 0, res, path, graph.length - 1);

        return res;
    }
}