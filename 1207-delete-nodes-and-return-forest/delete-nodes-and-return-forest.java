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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list=new ArrayList<>();
        if(root==null) return list;
        Set<Integer> set=new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }
        dfs(root,set,list);
        if(!set.contains(root.val)){
            list.add(root);
        }
        return list;
    }
    private TreeNode dfs(TreeNode node,Set<Integer> set,List<TreeNode> list){
        if(node==null) return null;
        node.left=dfs(node.left,set,list);
        node.right=dfs(node.right,set,list);
        if(set.contains(node.val)){
            if(node.left!=null){
                list.add(node.left);
            }
            if(node.right!=null){
                list.add(node.right);
            }
            return null;
        }
        return node;
    }
}