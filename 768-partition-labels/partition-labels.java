class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] l=new int[26];
        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']=i;
        }
        List<Integer> list=new ArrayList<>();
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,l[s.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start=i+1;
            }
        }
        return list;
    }
}