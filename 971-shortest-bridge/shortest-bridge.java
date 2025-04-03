class Solution {
    public void dfs(int[][] grid, int i, int j, Queue<tuple> que)
    {
        if(i<0 || j<0 || i==grid.length || j==grid.length || grid[i][j]==0 || grid[i][j]==2) return;
        que.add(new tuple(i,j,0));
        grid[i][j]=2;
        dfs(grid, i, j-1, que);
        dfs(grid, i-1, j, que);
        dfs(grid, i, j+1, que);
        dfs(grid, i+1, j, que);
    }
    public int shortestBridge(int[][] grid) {
        int x=-1,y=-1;
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && x==-1 && y==-1)
                {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        
        Queue<tuple> que=new LinkedList<>();
        dfs(grid,x,y,que);

        while(!que.isEmpty())
        {
            tuple temp=que.poll();
            int i=temp.x,j=temp.y,dist=temp.flips;
            if(grid[i][j]==1 || (i-1>=0 && grid[i-1][j]==1) || (j-1>=0 && grid[i][j-1]==1) || (i+1<n && grid[i+1][j]==1) || (j+1<n && grid[i][j+1]==1)) return dist;
            if(j-1>=0 && grid[i][j-1]==0)
            {
                grid[i][j-1]=-1;
                que.add(new tuple(i,j-1,dist+1));
            }
            if(i-1>=0 && grid[i-1][j]==0)
            {
                grid[i-1][j]=-1;
                que.add(new tuple(i-1,j,dist+1));
            }
            if(j+1<n && grid[i][j+1]==0)
            {
                grid[i][j+1]=-1;
                que.add(new tuple(i,j+1,dist+1));
            }
            if(i+1<n && grid[i+1][j]==0)
            {
                grid[i+1][j]=-1;
                que.add(new tuple(i+1,j,dist+1));
            }
        }
        return -1;
    }
}
class tuple
{
    int x,y,flips;
    tuple(int x, int y, int flips)
    {
        this.x=x;
        this.y=y;
        this.flips=flips;
    }
}