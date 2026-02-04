class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] di=new int[1001];
        for(int[] t:trips){
            int p=t[0];
            int f=t[1];
            int s=t[2];
            di[f]+=p;
            di[s]-=p;
        }
        int cp=0;
        for(int i=0;i<=1000;i++){
            cp+=di[i];
            if(cp>capacity){
                return false;
            }
        }
        return true;
    }
}