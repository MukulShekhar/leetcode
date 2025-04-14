class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        Queue<pair> que=new LinkedList<>();
        int n=grid.length;
        que.add(new pair(0,0,1));
        while(!que.isEmpty())
        {
            pair temp=que.poll();
            int i=temp.x,j=temp.y,dist=temp.cells;
            if(grid[i][j]==0)
            {
                grid[i][j]=-1;
                if(i==n-1 && j==n-1) return dist;
                if(j-1>=0 && grid[i][j-1]==0) que.add(new pair(i,j-1,dist+1));
                if(i-1>=0 && grid[i-1][j]==0) que.add(new pair(i-1,j,dist+1));
                if(j+1<n && grid[i][j+1]==0) que.add(new pair(i,j+1,dist+1));
                if(i+1<n && grid[i+1][j]==0) que.add(new pair(i+1,j,dist+1));
                if(i-1>=0 && j-1>=0 && grid[i-1][j-1]==0) que.add(new pair(i-1,j-1,dist+1));
                if(i-1>=0 && j+1<n && grid[i-1][j+1]==0) que.add(new pair(i-1,j+1,dist+1));
                if(i+1<n && j-1>=0 && grid[i+1][j-1]==0) que.add(new pair(i+1,j-1,dist+1));
                if(i+1<n && j+1<n && grid[i+1][j+1]==0) que.add(new pair(i+1,j+1,dist+1));
            }
        }
        return -1;
    }
}
class pair
{
    int x,y,cells;
    pair(int x, int y, int cells)
    {
        this.x=x;
        this.y=y;
        this.cells=cells;
    }
}