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
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
    }
    public TreeNode search(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(root.val>val){
            return search(root.left,val); //如果要搜素的值比当前结点小，搜索左子树
        }
        else{
            return search(root.right,val); //如果要搜素的值比当前结点大，搜索右子树
        }
    }
}
