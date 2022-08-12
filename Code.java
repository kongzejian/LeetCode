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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){   
            return null;   //如果只有一个元素。返回空链表
        }
        ListNode p=head;
        int count=0;
        while(p!=null){  //获得链表长度
            count+=1;
            p=p.next;
        }
        p=head;
        int step=count-n;
        if(step==0){    //如果删除的是头结点
            return head.next;
        }
        count=1;
        while(count!=step){  //移动到要删除结点的前一个结点
            p=p.next;
            count+=1;
        }
        p.next=p.next.next; //删除
        return head;
    }
}
