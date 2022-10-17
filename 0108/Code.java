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
    public TreeNode sortedArrayToBST(int[] nums) {
         return create(nums);
    }
     public TreeNode create(int[] nums){
        if(nums.length==0){
            return null;  //递归结束的条件，数组为空
        }
        TreeNode cur_node=new TreeNode(nums[nums.length/2]); //奇数取最中间的那个，偶数取索引为（数组长度-1）/2那个
        int[] left_num=new int[nums.length/2];
        int[] right_num=new int[nums.length- left_num.length-1];
        System.arraycopy(nums,0,left_num,0,left_num.length); //数组右半部分
        System.arraycopy(nums,nums.length/2+1,right_num,0,right_num.length); //数组左半部分
        cur_node.left=create(left_num); //递归
        cur_node.right=create(right_num);
        return cur_node;
    }
}
