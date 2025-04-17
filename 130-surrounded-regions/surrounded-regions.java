class Solution {
    private void dfs(int i,int j,char[][] board,boolean[][] vis){
        if(i<0 || j<0 || i==board.length || j==board[0].length ||board[i][j]=='X' || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        dfs(i,j-1,board,vis);
        dfs(i-1,j,board,vis);
        dfs(i,j+1,board,vis);
        dfs(i+1,j,board,vis);
    }
    public void solve(char[][] board) {
        if(board.length==0) return;
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O' && !vis[0][i]){
                dfs(0,i,board,vis);
            }
            if(board[board.length-1][i]=='O' && !vis[board.length-1][i]){
                dfs(board.length-1,i,board,vis);
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O' && !vis[i][0]){
                dfs(i,0,board,vis);
            }
            if(board[i][board[0].length-1]=='O' && !vis[i][board[0].length-1]){
                dfs(i,board[0].length-1,board,vis);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }    
}