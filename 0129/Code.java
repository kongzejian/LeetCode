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
    public int sumNumbers(TreeNode root) {
    search(root,0);
     return sum;
    }
    public void search(TreeNode root,int cur){
        if(root.left==null&&root.right==null){ //当前结点为叶子点
            cur=cur*10+root.val;
            sum+=cur; //加入sum
            return;
        }
        cur=cur*10+root.val; //加入当前值
        int o=cur;
        if(root.left!=null){ //递归左子树
        search(root.left,cur);}
        if(root.right!=null){ //递归右子树
        search(root.right,o);}
    }
}
