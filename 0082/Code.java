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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;                     //如果链表是空链表或者只有一个结点
        }
        ListNode p1=head;
        ListNode pre=head;
        int flag=0;
        while(p1!=null){
            if(p1.next!=null && p1.next.val==p1.val){   //如果当前结点和下一个结点值相同，则需要删除
                if(p1==head){                   //如果当前头结点是重复元素的结点，头结点需要后移
                    flag=1;
                }
                int number=p1.val;
                while(p1!=null && p1.val==number){
                    p1=p1.next;       //找到下一个和当前结点值不重复的结点
                }
                if(flag==1){
                    head=p1; //头结点后移
                    flag=0;
                    continue;
                }
                pre.next=p1;
                continue;
            }
            pre=p1; //pre记录第一个拥有重复值结点的前一个结点
            p1=p1.next;
        }
        return head;
}
}
