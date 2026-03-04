class Solution {
    public int firstUniqChar(String s) {
        int[] c=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(c[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}