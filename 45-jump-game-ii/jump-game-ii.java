class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int tj=0;
        int c=0;
        int lij=0;
        int d=n-1;
        if(n==1) return 0;
        for(int i=0;i<n;i++){
            c=Math.max(c,i+nums[i]);
            if(i==lij){
                lij=c;
                tj++;
                if(c>=d){
                    return tj;
                }
            }
        }
        return tj;
    }
}