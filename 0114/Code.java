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
    public void flatten(TreeNode root) {
        recursion(root);
    }
    public TreeNode recursion(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode original_right=root.right; //original_right为原右子树
        root.right=recursion(root.left); //root的右子树为变换好的左子树
        root.left=null; //左子树清空
        TreeNode cur=root;
        while(cur.right!=null){
            cur=cur.right; //到达新右子树的最右端
        }
        cur.right=recursion(original_right);//最右端的右子树为变换好的root的原右子树
        return root;
    }
}
