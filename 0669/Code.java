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
    public TreeNode trimBST(TreeNode root, int low, int high) {
       if(root==null){
            return null; //结点为空
        }
        else if(root.val<low){
            root.left=null;
            root=root.right;
            return trimBST(root,low,high); //根结点小于low，根结点的左支全部小于，全部删除，根结点替换为右节点
        }
        else if(root.val>high){
            root.right=null;
            root=root.left;
            return trimBST(root,low,high); //根结点大于high，根结点的右支全部大于，全部删除，根结点替换为左节点
        }
        if(root.left==null && root.right==null){
            return root;                            //叶结点且满足区间要求，直接返回
        }
        if(root.left!=null && root.left.val<low){   //左结点小于，但是左结点的右节点可能满足
            root.left=root.left.right;
        }
        if(root.right!=null && root.right.val>high){ //右结点大于，但是右结点的左节点可能满足
            root.right=root.right.left;
        }
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}
