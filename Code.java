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
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;      
        }
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null &&fast.next!=null){  //如果存在环，fast指针一定会与slow指针再次相遇
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               return true;
           }
       }
       return false;
}
}
