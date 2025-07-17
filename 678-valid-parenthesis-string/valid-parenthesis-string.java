class Solution {
    public boolean checkValidString(String s) {
        int cmax=0,cmin=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                cmax++;
                cmin++;
            }else if(c==')'){
                cmax--;
                cmin=Math.max(cmin-1,0);
            }else{
                cmax++;
                cmin=Math.max(cmin-1,0);
            }
            if(cmax<0){
                return false;
            }
        }
        return cmin==0;
    }
}