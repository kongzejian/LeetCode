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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;  //如果是空链表，直接返回
        }
        ListNode p1=head;
        ListNode oldhead=head;
        int count=0;
        while(p1!=null){
                p1=p1.next;
                count+=1;                //记录链表的长度
            }
          p1=head;
            if(count==1){
                return p1;                  //如果链表就包换一个结点，直接返回这个结点 
            }                    
            k=k%count;                    //取余，要移动几次
                while (k != 0) {
                    while(p1.next!=null && p1.next.next!=null) {
                        p1 = p1.next;      //到达倒数第二个结点
                    }
                    p1.next.next = oldhead;   //尾结点指向头结点
                    oldhead = p1.next;      // 尾结点成为新的头结点
                    p1.next = null;         //倒数第二个结点成为新的尾结点
                    p1 = oldhead;           p1指向头结点
                    k -= 1;
                }

        return p1;
}
}
