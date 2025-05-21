class Solution {
    public String shortestPalindrome(String s) {
        String reversed=new StringBuilder(s).reverse().toString();
        for(int i=0;i<reversed.length();i++){
            String suffix=reversed.substring(i);
            if(s.startsWith(suffix)){
                return reversed.substring(0,i)+s;
            }
        }
        return reversed+s;
    }
}