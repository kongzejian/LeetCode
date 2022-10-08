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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return recursion(root.left,root.right);
    }
    public boolean recursion(TreeNode left,TreeNode right){
        if(left==null && right==null){  //如果都为空结点，对称
            return true;
        }
        if(left==null || right==null){ //有一个是空节点，有一个不是，不对称
            return false;
        }
        if(left.val!=right.val){  //都不是空节点，但是值不等，不对称
            return false;
        }
        return recursion(left.left,right.right) && recursion(left.right,right.left); //至此，左右结点对称，但是要比较左结点的右子树和右节点的左子树，左结点的左子树和右节点的右子树
    }
}
