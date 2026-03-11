class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(word,board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(String word,char[][] board,int row,int col,int i){
        if(i==word.length()) return true;
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(i)) return false;
        char temp=board[row][col];
        board[row][col]='*';
        int[][] dir={ { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for(int[] m:dir){
            int nr=row+m[0];
            int nc=col+m[1];
            if(dfs(word,board,nr,nc,i+1)){
                return true;
            }
        }
        board[row][col]=temp;
        return false;
    }
}