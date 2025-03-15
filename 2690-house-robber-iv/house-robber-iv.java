class Solution {
    public int minCapability(int[] nums, int k) {
        int l=Integer.MAX_VALUE,h=1,result=0;
        for(int i:nums)
        {
            l=Math.min(l,i);
            h=Math.max(h,i);
        }
        while(l<=h)
        {
            int mid=(h+l)/2;
            int cnt=0,i=0;
            while(i<nums.length)
            {
                if(nums[i]<=mid)
                {
                    cnt++;
                    i++;
                }
                i++;
            }
            if(cnt>=k)
            {
                result=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
}