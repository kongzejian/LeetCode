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
        public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(isBalanced(root.left) && isBalanced(root.right)){ //左子树和右子树都是balanced的
            int left_depth=depth(root.left);  //计算左子树高度
            int right_depth=depth(root.right); //计算右子树高度
            return Math.abs(left_depth - right_depth) <= 1;
        }
        return false;

    }
    public int depth(TreeNode root){ //计算深度的函数
        if(root==null){
            return 0;
        }
        int left_depth=0;
        int right_depth=0;
        if(root.left!=null){
             left_depth=depth(root.left);
        }
        if(root.right!=null){
             right_depth=depth(root.right);
        }
        if(left_depth>right_depth){
            return 1+left_depth;
        }
        else{
            return 1+right_depth;
        }
    }
}
