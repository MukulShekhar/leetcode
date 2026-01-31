class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char r=letters[0];
        boolean f=false;
        for(char ch:letters){
            if(!f){
                if(ch>target){
                    r=ch;
                    f=!f;
                }
            }else{
                if(ch>target && ch<r) r=ch;
            }
        }
        return r;
    }
}