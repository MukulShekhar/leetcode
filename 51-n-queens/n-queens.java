class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        boolean[] c=new boolean[n];
        boolean[] di1=new boolean[2*n];
        boolean[] di2=new boolean[2*n];
        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        bt(0,n,board,c,di1,di2,res);
        return res;
    }
    private void bt(int row,int n,char[][] board,boolean[] c,boolean[] di1,boolean[] di2,List<List<String>> res){
        if(row==n){
            res.add(con(board));
            return;
        }
        for(int col=0;col<n;col++){
            int d1=row-col+n;
            int d2=row+col;
            if(!c[col] && !di1[d1] && !di2[d2]){
                board[row][col]='Q';
                c[col]=di1[d1]=di2[d2]=true;
                bt(row+1,n,board,c,di1,di2,res);
                board[row][col]='.';
                c[col]=di1[d1]=di2[d2]=false;
            }
        }
    }
    private List<String> con(char[][] board){
        List<String> r=new ArrayList<>();
        for(char[] row:board){
            r.add(new String(row));
        }
        return r;
    }
}