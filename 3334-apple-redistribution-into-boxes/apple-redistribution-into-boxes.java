class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int ts=0;
        for(int ap:apple){
            ts+=ap;
        }
        Arrays.sort(capacity);
        int sum=0;
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum+=capacity[i];
            count++;
            if(sum>=ts){
                break;
            }
        }
        return count;
    }
}