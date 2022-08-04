class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){ //防止整个是空链表
            return null;
        }
        ListNode p1=head;
        ListNode p2=p1.next;
        while(p2!=null && p1!=null){
            while(p1.val==p2.val && p2!=null){
                p2=p2.next;
                p1.next=p1.next.next;
                if(p2==null){
                        break;
                    }
            }
            if(p2==null){
                break;
            }
            p2=p2.next;
            p1=p1.next;
        }
        return head;
    }
}
