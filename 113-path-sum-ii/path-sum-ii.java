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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,targetSum,new ArrayList<>(),root);
        return res;
    }
    public void dfs(List<List<Integer>> res,int targetSum,List<Integer> path,TreeNode root){
        if(root==null) return;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum){
            res.add(new ArrayList<>(path));
        }else{
            dfs(res,targetSum-root.val,path,root.left);
            dfs(res,targetSum-root.val,path,root.right);
        }
        path.remove(path.size()-1);
    }
}