/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
         return divide(head,null); //分治
    }
    public TreeNode divide(ListNode left,ListNode right){ //左闭右开
        if(left==right){
            return null;
        }//举例子，就一个元素，1，左闭右开，left=1，right=null，mid为1，左闭右开，divide(left,mid)，left==mid 返回Null; divide(mid.next,right)，mid.next=mid，返回Null
        ListNode mid=mid(left,right);
        TreeNode root=new TreeNode(mid.val);
        root.left=divide(left,mid);
        root.right=divide(mid.next,right);
        return root;
    }
    public ListNode mid(ListNode left,ListNode right){ //找到left和right的中间数
        ListNode fast=left;
        ListNode slow=left;
        while(fast!=right&&fast.next!=right){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
