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
        return balanced(root)!=-1;
    }
    public int balanced(TreeNode root){
        if(root==null){
            return 0; //高度为0
        }
        int left_height=balanced(root.left);//左子树的高度
        int right_height=balanced(root.right);//右子树的高度
        if(left_height==-1 || right_height==-1){ //高度为-1说明不是平衡树
            return -1;
        }
        if(Math.abs(left_height-right_height)>1){ //左右子树高度差大于1
            return -1;
        }
        return Math.max(left_height,right_height)+1; //到这步，说明左右子树都是平衡树，且高度差小于1，自身也是平衡树，返回自己的高度
    }
}
