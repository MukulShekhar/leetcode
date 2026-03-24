class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> rev=new ArrayList<>();
        for(int i=0;i<n;i++){
            rev.add(new ArrayList<>());
        }
        int[] out=new int[n];
        for(int i=0;i<n;i++){
            for(int nei:graph[i]){
                rev.get(nei).add(i);
                out[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(out[i]==0){
                q.offer(i);
            }
        }
        boolean[] safe=new boolean[n];
        while(!q.isEmpty()){
            int node=q.poll();
            safe[node]=true;
            for(int prev:rev.get(node)){
                out[prev]--;
                if(out[prev]==0){
                    q.offer(prev);
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(safe[i]){
                res.add(i);
            }
        }
        return res;
    }
}