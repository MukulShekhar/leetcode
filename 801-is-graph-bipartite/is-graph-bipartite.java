class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] color = new int[v];
        Arrays.fill(color, -1);

        for (int i = 0; i < v; i++) {
            if (color[i] == -1) {
                if (!dfs(i, 0, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int node, int col, int[][] graph, int[] color) {
        color[node] = col;

        for (int i : graph[node]) {
            if (color[i] == -1) {
                color[i] = 1 - color[node];
                if (!dfs(i, color[i], graph, color)) {
                    return false;
                }
            } else if (color[node] == color[i]) {
                return false;
            }
        }
        return true;
    }
}