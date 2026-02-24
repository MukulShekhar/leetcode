class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        dfs(res,new ArrayList<>(),0,s);
        return res;
    }
    private void dfs(List<List<String>> res,List<String> temp,int start,String s){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(ispali(s,start,end)){
                temp.add(s.substring(start,end+1));
                dfs(res,temp,end+1,s);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean ispali(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)) return false;
        }
        return true;
    }
}