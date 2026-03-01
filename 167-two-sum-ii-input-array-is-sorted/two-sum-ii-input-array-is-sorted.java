class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int h=numbers.length-1;
        while(l<h){
            int s=numbers[l]+numbers[h];
            if(s==target){
                return new int[]{l+1,h+1};
            }else if(s<target){
                l++;
            }else{
                h--;
            }
        }
        return new int[]{};
    }
}