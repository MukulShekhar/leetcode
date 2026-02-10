class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int ml=0;
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            Set<Integer> m=new HashSet<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    s.add(nums[j]);
                }else{
                    m.add(nums[j]);
                }
                if(s.size()==m.size()){
                    ml=Math.max(ml,j-i+1);
                }
            }
        }
        return ml;
    }
}