import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums) l.add(n);
        int o=0;
        while(!nd(l)){
            int mins=Integer.MAX_VALUE;
            int ind=0;
            for(int i=0;i<l.size()-1;i++){
                int s=l.get(i)+l.get(i+1);
                if(s<mins){
                    mins=s;
                    ind=i;
                }
            }
            l.set(ind,mins);
            l.remove(ind+1);
            o++;
        }
        return o;
    }
        private boolean nd(List<Integer> l){
            for(int i=1;i<l.size();i++){
                if(l.get(i)<l.get(i-1)){
                    return false;
                }
            }
            return true;
        }
}
