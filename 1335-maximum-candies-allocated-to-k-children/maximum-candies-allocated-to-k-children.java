class Solution {
    public boolean check(int[] candy,int mid,long k){
        long y=0;
        for(int x:candy){
            y+=x/mid;
        }
        return y>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        long sum=0;
        int res=0;
        for(int x:candies){
            sum+=x;
        }
        if(sum<k){
            return 0;
        }
        int l =1;
        int r=(int) (sum/k);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(candies,mid,k)){
                res=mid;
                l=mid+1;
            }else{
                r=mid-1;;
            }
        }
        return res;
    }
}