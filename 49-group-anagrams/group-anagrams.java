class Solution {
    private String getfreqstring(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb=new StringBuilder("");
        char c='a';
        for(int i:freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            String freqstring=getfreqstring(str);
            if(map.containsKey(freqstring)){
                map.get(freqstring).add(str);
            }else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freqstring,list);
            }       
        }
        return new ArrayList<>(map.values());
    }
}