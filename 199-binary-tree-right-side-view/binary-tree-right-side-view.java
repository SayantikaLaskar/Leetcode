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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> r=new ArrayList<Integer>();
        right(root, r, 0);
        return r;
    }
    public void right(TreeNode c, List<Integer> r, int cd){
        if(c==null) return;
        if(cd==r.size()){
            r.add(c.val);
        }
        right(c.right, r, cd+1);
        right(c.left, r, cd+1);
    }
}