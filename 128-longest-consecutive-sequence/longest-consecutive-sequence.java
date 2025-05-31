class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int ls=1;
        int cs=1;
        int prevnum=nums[0];
        int expnum=prevnum+1;
        for(int i=1;i<nums.length;i++){
            int currnum=nums[i];
            if(prevnum==currnum){
                continue;
            }
            if(currnum==expnum){
                expnum++;
                cs++;
            }else{
                expnum=currnum+1;
                ls=Math.max(ls,cs);
                cs=1;
            }
            prevnum=currnum;
        }
        return Math.max(ls,cs);
    }
}