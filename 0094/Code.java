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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> l = new LinkedList<>();
        add(root,l);
        return l;
    }
    public void add(TreeNode root,List<Integer> l){
        if(root==null){
            return;
        }
        if(root.left!=null){
            add(root.left,l);
        }
        l.add(root.val);
        if(root.right!=null){
            add(root.right,l);
        }
    }
}
