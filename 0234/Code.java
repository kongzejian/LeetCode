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
    public boolean isPalindrome(ListNode head) {
        ListNode p1=head;
        ListNode head2=new ListNode(0,null);
        while(p1!=null){
            ListNode tmp=new ListNode(p1.val,null);
            if(head2.next==null){
                head2.next=tmp;
            }
            else{
                tmp.next=head2.next;
                head2.next=tmp;
            }
            p1=p1.next;
        }
        while(head!=null){
            if(head.val==head2.next.val){
                head=head.next;
                head2=head2.next;
            }
            else{
                return false;
            }
        }
        return true;
}
}
