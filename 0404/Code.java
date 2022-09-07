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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum_branche(root,0);
    }
    public int sum_branche(TreeNode root,int flag){ //辅助函数
        if(root.left==null && root.right==null &&flag==1){
            return root.val;  //该叶结点为左叶子结点，它的值需要返回
        }
        else if(root.left==null && root.right==null &&flag==0){   //该叶结点为右叶子结点，它的值不需要返回
            return 0;
        }
        int sum_left=0;
        int sum_right=0;
        if(root.left!=null){
            sum_left=sum_branche(root.left,1); //左支的左叶子结点的和
        }
        if(root.right!=null){
            sum_right=sum_branche(root.right,0); //右支的左叶子结点的和
        }
        
        return sum_left+sum_right;
    }
}
