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
    public TreeNode dfs(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int max=left;
        for(int i=left;i<=right;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        TreeNode root=new TreeNode(nums[max]);
        root.left=dfs(nums,left,max-1);
        root.right=dfs(nums,max+1,right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }
}