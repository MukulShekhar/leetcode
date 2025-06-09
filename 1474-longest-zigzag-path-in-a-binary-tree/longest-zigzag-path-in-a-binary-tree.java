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
    int maxL=0;
    public int longestZigZag(TreeNode root) {
        solve(root.left,true,1);
        solve(root.right,false,1);
        return maxL;
    }
    void solve(TreeNode root,boolean isleft,int currL){
        if(root==null) return;
        maxL=Math.max(maxL,currL);
        if(isleft){
            solve(root.right,false,currL+1);
            solve(root.left,true,1);
        }else{
            solve(root.left,true,currL+1);
            solve(root.right,false,1);
        }
    }
}