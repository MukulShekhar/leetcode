/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map;
    int max;
    public int dfs(TreeNode root)
    {
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int temp=root.val+left+right;
        map.put(temp,map.getOrDefault(temp,0)+1);
        if(map.get(temp)>max) max=map.get(temp);
        return temp;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        map=new HashMap<>();
        max=0;
        dfs(root);
        int cnt=0;
        for(int i:map.keySet()) if(map.get(i)==max) cnt++;
        int[] result=new int[cnt];
        int j=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
            {
                result[j]=i;
                j++;
            }
        }
        return result;
    }
}