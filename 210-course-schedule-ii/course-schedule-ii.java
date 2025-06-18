class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] indeg=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int node:adj.get(i)){
                indeg[node]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int[] ts=new int[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int node=q.remove();
            ts[i++]=node;
            for(int nbr:adj.get(node)){
                indeg[nbr]--;
                if(indeg[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        if(i==0 || i<numCourses){
            return new int[]{};
        }
        return ts;
    }
}