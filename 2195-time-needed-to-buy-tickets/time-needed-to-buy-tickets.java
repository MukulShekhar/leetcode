class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int t=0;
        while(true){
            int p=q.poll();
            tickets[p]--;
            t++;
            if(p==k && tickets[p]==0){
                return t;
            }
            if(tickets[p]>0) q.offer(p);
        }
    }
}