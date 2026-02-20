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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        int mind=Integer.MAX_VALUE;
        for(int i=1;i<res.size();i++){
            mind=Math.min(mind,res.get(i)-res.get(i-1));
        }
        return mind;
    }
    private void inorder(TreeNode node,List<Integer> res){
        if(node==null) return;
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }
}