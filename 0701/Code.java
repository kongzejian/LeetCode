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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         TreeNode insert_node=new TreeNode(val);
        if(root==null){
            return insert_node;
        }
        TreeNode cur=root;
        while(true){
            if(cur.val>val&&cur.left!=null){ //如果当前结点值大于插入值，且当前结点左边还有结点
                cur=cur.left; //更新当前结点
            }
            else if(cur.val>val){ //如果当前结点值大于插入值，做插入操作
                cur.left=insert_node;
                break;
            }
            else if(cur.val<val&&cur.right!=null){//如果当前结点值小于插入值，且当前结点右边还有结点
                cur=cur.right;//更新当前结点
            }
            else{
                cur.right=insert_node; ////如果当前结点值小于插入值，插入操作
                break;
            }
        }
        return root;
    }
    
}
