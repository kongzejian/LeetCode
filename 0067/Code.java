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
    public TreeNode expandBinaryTree(TreeNode root) {
         if(root.left!=null){ //如果左子树不为空
            root.left=expandBinaryTree(root.left);
            TreeNode minus_one1=new TreeNode(-1);
            minus_one1.left=root.left;
            root.left=minus_one1; //在左子树之间插入-1
        }
        if(root.right!=null){
            root.right=expandBinaryTree(root.right); //如果右子树不为空
            TreeNode minus_one2=new TreeNode(-1);
            minus_one2.right=root.right;
            root.right=minus_one2; //在右子树之间插入-1
        }
        return root; //返回root
    }
}
