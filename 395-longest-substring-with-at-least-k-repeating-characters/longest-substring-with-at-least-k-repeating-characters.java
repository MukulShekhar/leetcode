class Solution {
    public int longestSubstring(String s, int k) {
        return h(s.toCharArray(),0,s.length(),k);
    }
    private int h(char[] ch,int start,int end,int k){
        if(end-start<k) return 0;
        int[] co=new int[26];
        for(int i=start;i<end;i++) co[ch[i]-'a']++;
        for(int i=start;i<end;i++){
            if(co[ch[i]-'a']<k){
                int j=i+1;
                while(j<end && co[ch[j]-'a']<k){
                    j++;
                }
                return Math.max(h(ch,start,i,k),h(ch,j,end,k));
            }
        }
        return end-start;
    }
}