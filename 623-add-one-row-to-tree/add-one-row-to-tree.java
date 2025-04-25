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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        insert(root,depth,val,1);
        return root;
    }
    public void insert(TreeNode node,int d,int v,int currentDepth){
        if(node==null) return;
        if(currentDepth==d-1){
            TreeNode tmp=node.left;
            node.left=new TreeNode(v);
            node.left.left=tmp;
            tmp=node.right;
            node.right=new TreeNode(v);
            node.right.right=tmp;
        }
        else{
            insert(node.left,d,v,currentDepth+1);
            insert(node.right,d,v,currentDepth+1);
        }
    }
}