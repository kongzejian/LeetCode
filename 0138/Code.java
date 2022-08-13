/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {  //防止是空链表
        if(head==null){
            return null;
        }
        HashMap<Node, Node> map = new HashMap(); //创建哈希表
        Node cur=head;
        while(cur!=null){
            Node copy=new Node(cur.val);
            map.put(cur,copy);
            cur=cur.next;                    //将原来的结点作为键，复制结点作为值，存入哈希表中
        }
        cur=head;
        while(cur!=null){
            Node cur_copy=map.get(cur);
            cur_copy.next=map.get(cur.next);
            cur_copy.random=map.get(cur.random);
            cur=cur.next;                    //组成copy链表
        }
        return map.get(head);



    }
}
