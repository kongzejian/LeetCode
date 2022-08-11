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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode head=new ListNode(-1,null);
        ListNode p=head;
        int carry=0;
        while(l1!=null && l2!=null){
            int r=l1.val+l2.val+carry;
            if(r<10){
                p.next=new ListNode(r,null);
                carry=0;
            }
            else{
                p.next=new ListNode(r-10,null);
                carry=1;
            }
            l1=l1.next;
            l2=l2.next;
            p=p.next;
        }
        while(l1!=null){
            int r=carry+l1.val;
            if(r<10){
                p.next=new ListNode(r,null);
                carry=0;
            }
            else{
                p.next=new ListNode(r-10,null);
                carry=1;
            }
            l1=l1.next;
            p=p.next;
        }
        while(l2!=null){
            int r=carry+l2.val;
            if(r<10){
                p.next=new ListNode(r,null);
                carry=0;
            }
            else{
                p.next=new ListNode(r-10,null);
                carry=1;
            }
            l2=l2.next;
            p=p.next;
        }
        if(carry==1){
            p.next=new ListNode(carry,null);
        }
        return head.next;

    }
}
