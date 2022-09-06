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
        if(root==null){
            return 0;
        }
        int left_min_depth=minDepth(root.left);
        int right_min_depth=minDepth(root.right);
        if(root.left==null && root.right!=null){ //这里要特别注意，如果只有左子树，没有右子树，不能返回右子树为0，必须返回左子树+1
            return right_min_depth+1;
        }
        else if(root.left!=null && root.right==null){ //这里要特别注意，如果只有右子树，没有左子树，不能返回左子树为0，必须返回右子树+1
            return left_min_depth+1;
        }
        else{
            return Math.min(left_min_depth,right_min_depth)+1;
        }
    }
}
