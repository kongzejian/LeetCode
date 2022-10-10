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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         return create(inorder,postorder);
    }
    public TreeNode create(int[] inorder, int[] postorder){
        if(postorder.length==0){
            return null;  //递归返回条件，如果数组为空，
        }
        int last_of_postorder=postorder[postorder.length-1]; //后续数组最后一个元素的值
        int index=0;
        while(inorder[index]!=last_of_postorder){
            index++;                                    //在中序数组中找到和后续数组最后一个元素的值的索引
        }
        TreeNode cur=new TreeNode(last_of_postorder);
        int[] left_mid=new int[index];
        int[] right_mid=new int[inorder.length-index-1];
        System.arraycopy(inorder, 0, left_mid, 0, left_mid.length); //中序数组以此索引为分界线进行分割
        System.arraycopy(inorder,index+1,right_mid,0,right_mid.length);
        int[] left_post=new int[left_mid.length];
        int[] right_post=new int[right_mid.length];
        System.arraycopy(postorder,0,left_post,0,left_post.length);  //后续数组最后一个元素抛弃，以中序数组前后两个子数组为长度分割
        System.arraycopy(postorder,left_post.length,right_post,0,right_post.length);
        cur.left=create(left_mid,left_post); //递归构造左子树
        cur.right=create(right_mid,right_post);//递归构造右子树
        return cur;
    }
}
