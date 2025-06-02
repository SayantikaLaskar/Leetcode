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
    public void flatten(TreeNode root) {
        find(root);
    }
    public TreeNode find(TreeNode r){
        if(r==null) return null;
        TreeNode t1=find(r.left);
        TreeNode t2=find(r.right);
        if(r.left!=null){
            TreeNode rf=r.right;
            r.right=r.left;
            r.left=null;
            if(t1!=null) t1.right=rf;
        }
        if(t2!=null) return t2;
        if(t1!=null) return t1;
        return r;
    }
}