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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode head2=new ListNode(0,null);
        while(head!=null){
            ListNode tmp=new ListNode(head.val,null);
            if(head2.next==null){
                head2.next=tmp;
            }
            else{
                tmp.next=head2.next;
                head2.next=tmp;
            }
            head=head.next;
        }
        return head2.next;
    }
}
