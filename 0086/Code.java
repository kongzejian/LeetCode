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
    public ListNode partition(ListNode head, int x) {
            if(head==null || head.next==null){
            return head;
        }
        ListNode head1=new ListNode(-1,null);
        ListNode head2=new ListNode(-1,null);
        ListNode p1=head1;
        ListNode p2=head2;
        while(head!=null){
            if(head.val<x){
                p1.next=new ListNode(head.val,null);
                p1=p1.next;
            }
            else{
                p2.next=new ListNode(head.val,null);
                p2=p2.next;
            }
            head=head.next;
        }
        p1.next=head2.next;
        return head1.next;
    }
}
