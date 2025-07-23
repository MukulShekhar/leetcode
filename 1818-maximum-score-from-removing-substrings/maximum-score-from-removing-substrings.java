class Solution {
    int res;
    public int maximumGain(String s, int x, int y) {
        res=0;
        if(x>=y){
            String str=help(s,'a','b',x);
            String str2=help(str,'b','a',y);
        }else{
            String str=help(s,'b','a',y);
            String str2=help(str,'a','b',x);
        }
        return res;
    }
    public String help(String s,char a,char b,int points){
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char i:arr){
            if(!st.isEmpty() && st.peek()==a && i==b){
                res+=points;
                st.pop();
                continue;
            }
            st.push(i);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}