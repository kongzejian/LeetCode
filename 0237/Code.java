class Solution {
    public void deleteNode(ListNode node) {
        ListNode post=node.next;
       int tmp=post.val;
       post.val=node.val;
       node.val=tmp;
       node.next=node.next.next;
    }
}
