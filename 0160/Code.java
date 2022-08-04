public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headB;
        while(headA!=null){
            while(p!=null){
                if(headA.equals(p)){
                    return p;
                }
                else{
                p=p.next;
                }
            }
            headA=headA.next;
            p=headB;
        }
        return null;
    }
}
