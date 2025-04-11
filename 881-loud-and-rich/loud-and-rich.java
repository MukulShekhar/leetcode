class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        List<List<Integer>> list=new ArrayList<>();
        int n=quiet.length;
        int[] degree=new int[n];
        for(int i=0;i<n;i++) list.add(new ArrayList<Integer>());
        for(int[] i:richer) 
        {
            list.get(i[0]).add(i[1]);
            degree[i[1]]++;
        }
        int[] answer=new int[n];
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++) 
        {
            if(degree[i]==0) que.add(i);
            answer[i]=i;
        }
        while(!que.isEmpty())
        {
            int temp=que.poll();
            int val=quiet[answer[temp]];
            for(int i:list.get(temp))
            {
                degree[i]--;
                if(val<quiet[answer[i]]) answer[i]=answer[temp];
                if(degree[i]==0) que.add(i);
            }
        }
        return answer;
    }
}