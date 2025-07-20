class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length<=1){
            return 0;
        }
        int n=intervals.length;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        int r=0;
        int last=intervals[0][1];
        for(int i=1;i<n;i++){
            int curr=intervals[i][0];
            if(curr<last){
                r++;
            }else{
                last=intervals[i][1];
            }
        }
        return r;
    }
}