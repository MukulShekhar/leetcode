class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!d.isEmpty() && d.peek()<i-k+1){
                d.poll();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offer(i);
            if(i>=k-1){
                res[i-k+1]=nums[d.peek()];
            }
        }
        return res;
    }
}