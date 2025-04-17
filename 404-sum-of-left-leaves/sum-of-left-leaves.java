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
    static int res=0;
    private void dfs(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null) res+=root.left.val;
        dfs(root.left);
        dfs(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        int ans=res;
        res=0;
        return ans;
    }
}