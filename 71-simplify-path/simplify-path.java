class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> s=new Stack<>();
        for(String dir:parts){
            if(dir.equals("") || dir.equals(".")){
                continue;
            }else if(dir.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(dir);
            }
        }
        if(s.isEmpty()){
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String dir : s) {
            result.append("/").append(dir);
        }
         return result.toString();
    }
}
