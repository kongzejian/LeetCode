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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null){
            return head;               //如果链表只有一个元素，返回
        }
        int count=1;
        ListNode p=head;
        ListNode head2=new ListNode(-1,null);
        while(count<left-1){
            p=p.next;
            count+=1;
        }
        ListNode inter_after=p;
        ListNode old_last=new ListNode(-1,null);
        ListNode tail=new ListNode(-1,null);
        if(left==1){                 //此处考虑left为头结点，由于下面的代码遍历采用p.next，所以将头结点前面加一个dummy结点，并将count设为0
            ListNode dummy=new ListNode(-1,head);
            p=dummy;
            count=0;
        }
        while(count<right){
            if(head2.next==null){
                head2.next=new ListNode(p.next.val,null);
                old_last=head2.next;
                tail=head2.next;
                count+=1;
                p=p.next;
                continue;   //新增一个链表存放倒序的部分
            }
            ListNode n=new ListNode(p.next.val, null);
            head2.next=n;
            n.next=old_last;
            old_last=n;
            count+=1;
            p=p.next;
        }
        if(left!=1){    //将倒序的部分与原链表拼接
        inter_after.next=head2.next;   
        tail.next=p.next;
        return head;}
        else{
            tail.next=p.next;
            return head2.next;
        }
}
}
