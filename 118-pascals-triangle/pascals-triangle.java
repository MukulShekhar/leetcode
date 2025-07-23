class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 
            if (i > 0) {
                List<Integer> prev = res.get(i - 1);
                for (int j = 1; j < prev.size(); j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
                row.add(1); 
            }
            
            res.add(row);
        }
        
        return res;
    }
}