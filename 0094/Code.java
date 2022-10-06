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
    public List<Integer> inorderTraversal(TreeNode root) {
         trasverse(root,result);
        return result;
    }
    public void trasverse(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        trasverse(root.left,result);
        result.add(root.val);
        trasverse(root.right,result);
    }
}
