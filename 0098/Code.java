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
    public LinkedList<Integer> node=new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        trasverse(root);
        for(int i=1;i<node.size();i++){
            if(node.get(i)<=node.get(i-1)){ //判定中序遍历的结果是否递增
                return false;
            }
        }
        return true;
    }
    public void trasverse(TreeNode root){ //中序遍历
        if(root==null){
            return;
        }
        trasverse(root.left);
        node.add(root.val);
        trasverse(root.right);

    }
   
}
