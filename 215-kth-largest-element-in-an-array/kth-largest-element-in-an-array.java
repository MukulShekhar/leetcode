class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
       for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
       }
       int n=k-1;
       for(int i=0;i<n;i++){
        pq.remove();
       }
       int res=pq.peek();
       return res;
    }
}