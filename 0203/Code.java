class Solution {
    public ListNode removeElements(ListNode head, int val) {
      ListNode cur=head;
        if(head==null){ //如果是空链表，返回空链表
            return null;
        }
         while(cur!=null){ //应对要删除的元素在开头的情况
            if(cur.val==val){
            head=cur.next;
            cur=head;}
            else{
                break;
            }
        }
        while(cur!=null && cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            else{
            cur=cur.next;}
        }
        return head;
}
}
