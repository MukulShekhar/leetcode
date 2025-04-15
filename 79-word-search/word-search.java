class Solution {
    private boolean dfs(char[][] board,String word,int row,int col,int index){
        if(index==word.length()){
            return true;
        }
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(index)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='*';
        int[][] dir={ { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for(int[] m:dir){
            int nrow=row+m[0];
            int ncol=col+m[1];
            if(dfs(board,word,nrow,ncol,index+1)){
                return true;
            }
        }
        board[row][col]=temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(dfs(board,word,row,col,0)){
                    return true;
                }
            }
        }
        return false;
    }
}