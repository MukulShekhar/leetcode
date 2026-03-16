class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> ms=new HashSet<>();
        int len=0;
        for(char c:s.toCharArray()){
            if(ms.contains(c)){
                ms.remove(c);
                len=len+2;
            }else{
                ms.add(c);
            }
        }
        if(!ms.isEmpty()){
            len=len+1;
        }
        return len;
    }
}