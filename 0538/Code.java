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
     public int sum=0;
    public TreeNode convertBST(TreeNode root) {
        transvers(root);
        return root;
    }
    public void transvers(TreeNode root){    //先遍历右子树，再遍历根结点，再遍历左子树
        if(root==null){
            return;
        }
        if(root.right!=null){
            transvers(root.right);
        }
        root.val+=sum;   //这两行是精华，sum为所有比他大的所有结点的sum，加上本身
        sum=root.val;  //更新sum的值
        if(root.left!=null){
            transvers(root.left);
        }
    }
}
