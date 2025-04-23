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
    static String s="";
    public void dfs(TreeNode root){
        if(root==null) return;
        s=s+"("+Integer.toString(root.val);
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null){
            dfs(root.left);
            s=s+")";
        }else{
            s=s+"()";
        }
        if(root.right!=null){
            dfs(root.right);
            s=s+")";
        }
    }
    public String tree2str(TreeNode root) {
        dfs(root);
        String c=s.substring(1,s.length());
        s="";
        return c;
    }
}