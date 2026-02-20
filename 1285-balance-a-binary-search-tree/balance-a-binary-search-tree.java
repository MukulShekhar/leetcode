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
    List<Integer> l=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        ino(root);
        return bb(0,l.size()-1);
    }
    private void ino(TreeNode root){
        if(root==null) return;
        ino(root.left);
        l.add(root.val);
        ino(root.right);
    }
    private TreeNode bb(int lo,int h){
        if(lo>h) return null;
        int m=lo+(h-lo)/2;
        TreeNode root=new TreeNode(l.get(m));
        root.left=bb(lo,m-1);
        root.right=bb(m+1,h);
        return root;
    }
}