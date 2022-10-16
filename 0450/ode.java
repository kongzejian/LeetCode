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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
     public TreeNode delete(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(root.val==key){
            if(root.left==null&&root.right==null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                TreeNode min=root.right; //找到右子树最小的值
                while(min.left!=null){
                    min=min.left;
                }
                min.left=root.left; //将根结点的左子树接到右子树最小的值的左子树
                root=root.right;
                return root;
            }
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            root.right=deleteNode(root.right,key);
        }
        return root;
    }
}
