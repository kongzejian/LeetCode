/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){ //说明有环
                    fast=head;
                    while(true){
                    if(fast==slow){
                        return slow;
                    }
                    fast=fast.next;  
                    slow=slow.next;
                    }
                }
            }

            return null;
    }
}
