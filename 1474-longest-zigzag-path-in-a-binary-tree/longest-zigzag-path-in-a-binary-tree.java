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
    int m=0;
    void solve(TreeNode root, int d, int c){
        if(root==null) return;
        m=Math.max(m, c);
        if(d==1){
            solve(root.left, 0, c+1);
            solve(root.right, 1, 1);
        }else{
            solve(root.right, 1, c+1);
            solve(root.left, 0, 1);
        }
    }
    public int longestZigZag(TreeNode root) {
        solve(root, 0, 0);
        solve(root, 0, 0);
        return m;
    }
}