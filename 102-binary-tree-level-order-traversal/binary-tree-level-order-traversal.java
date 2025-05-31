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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        if(root==null) return a;
        func(root, 1, a);
        return a;
    }
    private void func(TreeNode r, int l, List<List<Integer>> a){
        if(r==null) return;
        if(l>a.size()){
            List<Integer> lv=new ArrayList<>();
            a.add(lv);
        }
        a.get(l-1).add(r.val);
        func(r.left, l+1, a);
        func(r.right, l+1, a);
    }
}