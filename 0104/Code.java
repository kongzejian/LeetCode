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
    public int maxDepth(TreeNode root) {
        if(root==null){   //如果根节点为空，深度为0
            return 0;
        }
        if(root.left==null && root.right==null){ //如果根节点为叶结点，深度为1
            return 1;
        }
        int left_max=maxDepth(root.left);  //左子树的深度
        int right_max=maxDepth(root.right); //右子树的深度
        if(left_max>right_max){
            return 1+left_max;   //根节点的1加上左子树的深度
        }
        else{
            return 1+right_max;  //根节点的1加上右子树的深度
        }
    }
}
