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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
          return create(nums);
    }
    public TreeNode create(int[] nums){
        if(nums.length==0){
            return null;
        }
        int max_index=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max_index=i;
                max=nums[i];
            }
        }   //获取最大值和最大值的索引
        TreeNode cur=new TreeNode(max);
        int[] left_num=new int[max_index];
        int[] right_num=new int[nums.length-max_index-1];
        System.arraycopy(nums,0,left_num,0,max_index); //最大值左边的元素
        System.arraycopy(nums,max_index+1,right_num,0,right_num.length); //最大值右边的元素
        cur.left=create(left_num);
        cur.right=create(right_num);
        return cur;
    }
}
