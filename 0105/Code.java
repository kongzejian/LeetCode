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
class Solution { //106题的翻版
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return create(preorder,inorder);
    }
    public TreeNode create(int[] preorder, int[] inorder){
        if(preorder.length==0){
            return null;
        }
        int first_of_preorder=preorder[0]; //获得前序遍历的根结点
        int index=0;
        while(inorder[index]!=first_of_preorder){
            index++;
        }
        TreeNode cur=new TreeNode(first_of_preorder);
        int[] left_mid=new int[index];
        int[] right_mid=new int[inorder.length-index-1];
        System.arraycopy(inorder, 0, left_mid, 0, left_mid.length);
        System.arraycopy(inorder,index+1,right_mid,0,right_mid.length);
        int[] left_pre=new int[left_mid.length];
        int[] right_pre=new int[right_mid.length];
        System.arraycopy(preorder,1,left_pre,0,left_pre.length);
        System.arraycopy(preorder,left_pre.length+1,right_pre,0,right_pre.length);
        cur.left=create(left_pre,left_mid);
        cur.right=create(right_pre,right_mid);
        return cur;
    }
}
