class Solution {
    private static final String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static void backtrack(String digits,int index,String current,List<String> result){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        for(char letter:map[digits.charAt(index)-'0'].toCharArray()){
            backtrack(digits,index+1,current+letter,result);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> result=new ArrayList<>();
        backtrack(digits,0,"",result);
        return result;
    }
}