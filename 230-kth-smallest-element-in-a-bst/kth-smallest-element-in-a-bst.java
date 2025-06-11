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
    private int n=0;
    private int c=0;
    public int kthSmallest(TreeNode root, int k) {
        c=k;
        h(root);
        return n;
    }
    public void h(TreeNode m){
        if(m.left!=null) h(m.left);
        c--;
        if(c==0){
            n=m.val;
            return;
        }
        if(m.right!=null) h(m.right);
    }
}