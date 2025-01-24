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
    public int findDepth(TreeNode root) {
        if(root==null) return 0;
        int lh=findDepth(root.left);
        int rh=findDepth(root.right);
        return 1+Math.max(lh, rh);
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        return findDepth(root);
    }
}