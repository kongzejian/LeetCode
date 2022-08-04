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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode p3=new ListNode(0,null); //创建新的空结点
        ListNode head=p3;                //记录这个空结点，返回的时候返回空结点的下一个结点（第一个有数据的结点）
        while(p1!=null && p2!=null){
             if(p1.val<p2.val){
            p3.next=p1;
            p1=p1.next;
            p3=p3.next;
        }
        else{
            p3.next=p2;
             p3=p3.next;
            p2=p2.next;
        }
        }
        while(p1==null && p2!=null){
            p3.next=p2;
             p3=p3.next;
            p2=p2.next;
        }
        while(p2==null && p1!=null){
            p3.next=p1;
             p3=p3.next;
            p1=p1.next;
        }
       return head.next;
    }
}
