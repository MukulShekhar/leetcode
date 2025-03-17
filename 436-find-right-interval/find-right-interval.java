class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] result=new int[intervals.length];
        int[][] arr=new int[intervals.length][2];
        for(int i=0;i<intervals.length;i++)
        {
            arr[i][0]=intervals[i][0];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++)
        {
            int l=0,h=arr.length-1,val=-1;
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(arr[mid][0]>=intervals[i][1])
                {
                    val=arr[mid][1];
                    h=mid-1;
                }
                else l=mid+1;
            }
            result[i]=val;
        }
        return result;
    }
}   