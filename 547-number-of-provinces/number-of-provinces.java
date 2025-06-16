class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cnt=0;
        int size=isConnected.length;
        boolean[] vis=new boolean[size];
        for(int i=0;i<size;i++){
            if(vis[i]==false){
            cnt++;
            bfs(isConnected,vis,i,size);
            }
        }
        return cnt++;
    }
    public void bfs(int[][] isConnected,boolean[] vis,int v,int size){
        Queue<Integer> q=new LinkedList<>();
        q.add(v);
        vis[v]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i=0;i<size;i++){
                if(i!=size && isConnected[node][i]==1 && vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
    }
}