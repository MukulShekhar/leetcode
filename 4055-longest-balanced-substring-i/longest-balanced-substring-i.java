class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int ml=0;
        for(int i=0;i<n;i++){
            int[] f=new int[26];
            for(int j=i;j<n;j++){
                f[s.charAt(j)-'a']++;
                if(isb(f)){
                    ml=Math.max(ml,j-i+1);
                }
            }
        }
        return ml;
    }
    private boolean isb(int[] f){
        int val=0;
        for(int i:f){
            if(i>0){
                if(val==0) val=i;
                else if(val!=i) return false;
            }
        }
        return true;
    }
}