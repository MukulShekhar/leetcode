class Solution {
    public static void bfs(List<List<Integer>> rooms,int i,boolean[] vis,Queue<Integer> q){
        vis[i]=true;
        q.add(i);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int j:rooms.get(node)){
                if(!vis[j]){
                    vis[j]=true;
                    q.add(j);
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        bfs(rooms,0,vis,q);
        for(int i=0;i<n;i++){
            if(vis[i]!=true){
                return false;
            }
        }
        return true;
    }
}