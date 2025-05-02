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
    int res=0;
    public int dfs(TreeNode root,int parent){
        if(root==null) return 0;
        int left=dfs(root.left,root.val);
        int right=dfs(root.right,root.val);
        res=Math.max(res,left+right);
        if(parent==root.val){
            return 1+Math.max(left,right);
        }
        return 0;
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        res=0;
        dfs(root,root.val);
        return res;
    }
}