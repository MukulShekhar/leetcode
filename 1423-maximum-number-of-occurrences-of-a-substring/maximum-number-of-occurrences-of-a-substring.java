class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        if(s==null || s.length()==0 || maxLetters==0){
            return 0;
        }
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<s.length()-minSize+1;i++){
            String cur=s.substring(i,i+minSize);
            if(isValid(cur,maxLetters)){
                map.put(cur,map.getOrDefault(cur,0)+1);
                max=Math.max(max,map.get(cur));
            }
        }
        return max;
    }
    boolean isValid(String cur,int maxLetters){
        HashSet<Character> set=new HashSet<>();
        for(char c:cur.toCharArray()){
            set.add(c);
        }
        return set.size()<=maxLetters;
    }
}