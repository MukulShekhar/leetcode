class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] ms=new String[n];
        for(int i=0;i<n;i++){
            ms[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ms,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(String str:ms){
            sb.append(str);
        }
        String res=sb.toString();
        return res.startsWith("0") ? "0" : res;
    }
}