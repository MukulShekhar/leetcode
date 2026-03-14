class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int l1=ex(s,i,i);
            int l2=ex(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>end-start){
                start=i-(l-1)/2;
                end=i+l/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int ex(String s,int le,int ri){
        while(le>=0 && ri<s.length() && s.charAt(le)==s.charAt(ri)){
            le--;
            ri++;
        }
        return ri-le-1;
    }
}