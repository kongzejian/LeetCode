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
    public List<Integer> result=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        trasverse(root,result);
        return result;
    }
    public void trasverse(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        trasverse(root.left,result);
        trasverse(root.right,result);
    }
}
