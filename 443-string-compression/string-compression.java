class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char currchar=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==currchar){
                i++;
                count++;
            }
                chars[index++]=currchar;
                if(count>1){
                    String s=String.valueOf(count);
                    for(char c:s.toCharArray()){
                        chars[index++]=c;
                    }
                }
            
        }
        return index;
    }
}