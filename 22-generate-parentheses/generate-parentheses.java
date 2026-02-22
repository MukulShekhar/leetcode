class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs("",0,0,res,n);
        return res;
    }
    private void dfs(String curr,int left,int right,List<String> res,int n){
        if(left==n && right==n){
            res.add(curr);
            return;
        }
        if(left<n){
            dfs(curr + "(",left+1,right,res,n);
        }
        if(left>right){
            dfs(curr + ")",left,right+1,res,n);
        }
    }
}
