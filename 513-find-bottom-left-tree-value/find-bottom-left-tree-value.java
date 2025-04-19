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
    static int lastlevel=-1;
    static int res=-1;
    private void dfs(TreeNode root,int level){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(level>lastlevel){
                lastlevel=level;
                res=root.val;
            }
            return;
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        int ans=res;
        lastlevel=-1;
        res=-1;
        return ans;
    }
}