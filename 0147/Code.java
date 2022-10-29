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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyhead = new ListNode(); //创建哑结点
        dummyhead.next = head;
        ListNode tail = head; //tail表示有序序列的最后一个结点
        while (tail.next != null) {
            ListNode cur = tail.next;
            ListNode pre = dummyhead;
            while (pre.next.val < cur.val && pre != tail) {
                pre = pre.next; //pre为原链表当前结点 在有序部分中 插入位置的前一个结点，比如 dummy->1->2->4(tail)->3->5，pre为2
            }
            if (tail != pre) { //如果pre不为tail
                tail.next = cur.next;
                cur.next = pre.next;
                pre.next = cur; //交换
            } else {
                tail = cur; // dummy->1->2->3->4(tail)->5 这个情况
            }
        }
        return dummyhead.next;
    }
}
