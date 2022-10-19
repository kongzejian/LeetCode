/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> result=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        trasverse(root);
        return result;
    }
     public void trasverse(Node root){
        if(root==null){
            return;
        }
        for(int i=0;i<root.children.size();i++){
            trasverse(root.children.get(i));
        }
        result.add(root.val);
    }
}
