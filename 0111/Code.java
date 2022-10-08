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
    public int minDepth(TreeNode root) {
        return min_depth(root);
    }
    public int min_depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftdepth=min_depth(root.left);
        int rightdepth=min_depth(root.right);
        if(leftdepth==0 && rightdepth==0){ //如果为叶结点返回1
            return 1;
        }
        if(leftdepth==0 || rightdepth==0){ //如果只有左子树或只有右子树，不能返回最小值0，而是返回有子树的那个深度
            return Math.max(leftdepth,rightdepth)+1;
        }
        return Math.min(leftdepth,rightdepth)+1; //有左子树也有右子树，返回最小深度+1
    }
}
