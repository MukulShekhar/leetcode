class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int m=nums2.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> (a[0]-b[0]));
        HashSet<String> vis=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();

        pq.add(new int[]{nums1[0]+nums2[0],0,0});
        vis.add("0,0");

        while(k-->0 && !pq.isEmpty()){
            int[] curr=pq.poll();
            int sum=curr[0];
            int i=curr[1];
            int j=curr[2];
            ans.add(Arrays.asList(nums1[i],nums2[j]));

            if(i+1<n  && !vis.contains((i+1)+","+j)){
                pq.add(new int[]{nums1[i+1]+nums2[j],i+1,j});
                vis.add((i+1)+","+j);
            }

            if(j+1<m  && !vis.contains(i+","+(j+1))){
                pq.add(new int[]{nums1[i]+nums2[j+1],i,j+1});
                vis.add(i+","+(j+1));
            }
        }
        return ans;
    }
}