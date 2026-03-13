class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
       long l=1;
       long r=(long)1e18;
       long ans=r;
       while(l<=r){
        long m=l+(r-l)/2;
        if(canre(m,mountainHeight,workerTimes)){
            ans=m;
            r=m-1;
        }else{
            l=m+1;
        }

       }
       return ans; 
    }
    private boolean canre(long time,int mountainHeight, int[] workerTimes){
        long total=0;
        for(int t:workerTimes){
            long x=(long) ((Math.sqrt(1+8.0*time/t)-1)/2);
            total+=x;
            if(total>=mountainHeight) return true;
        }
        return false;
    }
}