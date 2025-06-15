class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans =new ArrayList<>();
        if(n==1 || n==2){
            for(int i=0;i<n;i++){
                ans.add(i);
            }
            return ans;
        }
        int[] deg=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            deg[edge[0]]++;
            deg[edge[1]]++;
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(deg[i]==1){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            ans=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                int el=q.remove();
                ans.add(el);
                for(int nbr:adj.get(el)){
                    deg[nbr]--;
                    if(deg[nbr]==1){
                        q.add(nbr);
                    }
                }
            }
        }
        return ans;
    }
}