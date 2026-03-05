class Solution {
    public int minOperations(String s) {
        int cs0=0;
        int cs1=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char e0 = (i % 2 == 0) ? '0' : '1';
            char e1 = (i % 2 == 0) ? '1' : '0';
            if(c!=e0) cs0++;
            if(c!=e1) cs1++;
        }
        return Math.min(cs0,cs1);
    }
}