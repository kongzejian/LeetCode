class MinStack {
    
   private class Node{
        public int item;
        public Node next;
        private Node(int item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    private Node head;
    public MinStack() {
        this.head=new Node(-1,null);
    }

    public void push(int val) {
        if(head.next==null){
            head.next=new Node(val,null);
        }
        else {
            Node oldnext=head.next;
            head.next=new Node(val,oldnext);
        }
    }

    public void pop() {
        if(head.next!=null){
            head.next=head.next.next;
        }

    }

    public int top() {
        return head.next.item;
    }

    public int getMin() {
        Node p=head.next;
        Node min=head.next;
        while(p.next!=null){
            p=p.next;
            if(p.item<min.item){
                min=p;
            }
        }
        return min.item;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
