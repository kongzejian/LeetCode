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
   public int max=1; //全局变量，记录直径最大值
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return max-1;
    }
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int Ldeep=deep(root.left);
        int Rdeep=deep(root.right);
            max=Math.max(Rdeep+Ldeep+1,max); //更新直径最大值
        
        return 1+Math.max(Ldeep,Rdeep);//返回的是深度
    }
}
