class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int c=edge[0];
            int p=edge[1];
            adj.get(p).add(c);
        }
        int[] ind=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int neighbor:adj.get(i)){
                ind[neighbor]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int neighbor:adj.get(node)){
                ind[neighbor]--;
                if(ind[neighbor]==0){
                    q.add(neighbor);
                }
            }
        }
        return count==numCourses;
    }
}