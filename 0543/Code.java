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
   public int max=0; //全局变量，记录直径最大值
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return max;
    }
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int Ldeep=deep(root.left); //左子树的深度
        int Rdeep=deep(root.right); //右子树的深度
            max=Math.max(Rdeep+Ldeep,max); //更新直径最大值，本树的直径
        
        return 1+Math.max(Ldeep,Rdeep);//返回的是本节点作为根结点树的深度
    }
}
