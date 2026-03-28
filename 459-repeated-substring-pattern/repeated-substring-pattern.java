class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss=s+s;
        String tr=ss.substring(1,ss.length()-1);
        return tr.contains(s);
    }
}