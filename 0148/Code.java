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
    public ListNode sortList(ListNode head) {
          if(head==null||head.next==null){
            return head;                    //输入空列表或者只有一个结点，返回
        }
        ListNode fast=head.next; //这一步很关键，fast和slow起点不一样
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){ //找到中间结点
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode second_head=slow.next; 
        slow.next=null;            //断开，分
        ListNode h1=sortList(head); //递归
        ListNode h2=sortList(second_head);

        ListNode dummy_new=new ListNode(-1); //哑结点创建
        ListNode cur=dummy_new;
        while(h1!=null&&h2!=null){ //治，双指针
            if(h1.val<h2.val){
                cur.next=h1;
                cur=cur.next;
                h1=h1.next;
            }
            else{
                cur.next=h2;
                cur=cur.next;
                h2=h2.next;
            }
        }
        if(h1!=null){ //有一个链表已经遍历完，另一个还有，全部接到后面
            cur.next=h1;
        }
        if(h2!=null){
            cur.next=h2;
        }
        return dummy_new.next;
    }
}
