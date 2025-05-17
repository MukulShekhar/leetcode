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
    static class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int mW=0;
        while(!q.isEmpty()){
            int size=q.size();
            int mI=q.peek().index;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                int index=curr.index-mI;
                if(i==0) first=index;
                if(i==size-1) last=index;
                if(curr.node.left!=null){
                    q.add(new Pair(curr.node.left,2*index));
                }
                if(curr.node.right!=null){
                    q.add(new Pair(curr.node.right,2*index+1));
                }
            }
            mW=Math.max(mW,last-first+1);
        }
        return mW;
    }
}