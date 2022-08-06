class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode p1=head;
        if(p1==null){   //如果是全空。直接返回头结点
            return head;
        }
        ListNode p2=head.next;
        ListNode pre=null;
        while(p2!=null){
            ListNode s1=new ListNode(p2.val,null);
            ListNode s2=new ListNode(p1.val,null); //创建新的两个
            if(pre!=null){
            pre.next=s1; //如果pre不为空，接上s1
            }
            else{
                head=s1; //说明p1 p2是头两个，head为新链表开头
            }
            s1.next=s2; 
            pre=s2; //保存这次的第二个结点，为接下一个pair作准备
            if(p1.next.next==null){
                return head;          //到头了
            }
            p1=p1.next.next;
            p2=p2.next.next;
            if(p2==null){         //说明元素为奇数
                s2.next=p1;
            }
        }
        return head;
    }
}
