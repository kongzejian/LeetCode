/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         return commonancestor(root,p,q);
    }
    public TreeNode commonancestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root== q){
            return root;
        }
        TreeNode left=commonancestor(root.left,p,q);
        TreeNode right=commonancestor(root.right,p,q);
        if(left==null&&right!=null){
            return right;
        }
        else if(left!=null&&right==null){
            return left;
        }
        else if(left != null){
            return root;
        } else {
            return null;
        }
    }
}
