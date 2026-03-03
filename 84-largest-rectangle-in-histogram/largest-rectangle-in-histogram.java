class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ma=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n) ?0 : heights[i];
            while(!s.isEmpty() && h<heights[s.peek()]){
                int hh=heights[s.pop()];
                int ww=s.isEmpty() ? i : i-s.peek()-1;
                ma=Math.max(ma,hh*ww);
            }
            s.push(i);
        }
        return ma;
    }
}