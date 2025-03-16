class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minR=Integer.MAX_VALUE;
        for(int i=0;i<ranks.length;i++){
            minR=Math.min(minR,ranks[i]);
        }
        long l=1;
        long h=1L*minR*cars*cars;
        while(l<h){
            long mid=(l+h)/2;
            long count=0;
            for(int i=0;i<ranks.length;i++){
                count+=(long) Math.sqrt(mid/(long) ranks[i]);
            }
            if(count>=cars){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}