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
    public int maxDepth(Node root) {
        return max_depth(root);
    }
    public int max_depth(Node root){
        if(root==null){
            return 0;
        }
        int max=0;  //这一步的值很重要，如果是叶子结点，不进入循环，返回时必须是1，所以max设为0
        for(int i=0;i<root.children.size();i++){
            max=Math.max(max,max_depth(root.children.get(i)));
        }
        return max+1;
    }
}
