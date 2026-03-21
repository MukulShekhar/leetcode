class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(0);
            }else{
                int val=st.pop();
                int sco=Math.max(2*val,1);
                st.push(st.pop()+sco);
            }
        }
        return st.peek();
    }
}