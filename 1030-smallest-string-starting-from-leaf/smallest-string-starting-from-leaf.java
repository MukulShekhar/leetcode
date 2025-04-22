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
    String ans="";
    public String dfs(TreeNode root,String res){
        if(root==null){
            return "";
        }
        res=(char)(root.val+97)+res;
        if(root.left==null && root.right==null){
            if(ans==""){
            ans=res;
            }
            if(ans.compareTo(res)>0){
            ans=res;
            }
        }
        dfs(root.left,res);
        dfs(root.right,res);
        return ans;
    }
    public String smallestFromLeaf(TreeNode root) {
        return dfs(root,"");
    }
}