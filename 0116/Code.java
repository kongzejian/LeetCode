/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node result=root;
        if(root==null){
            return result;
        }
        int size;
        Queue<Node> queue =new LinkedList<>();
        queue.add(root); //加入根结点
        while(!queue.isEmpty()){
            size= queue.size();
            List<Node> layer=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node cur=queue.poll();
                layer.add(cur);
                if(i!=size-1){
                    cur.next=queue.peek();   //如果不是本层的最右结点，就指向队列中的下一个结点
                }
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
           
        }
        return result;
    }
}
