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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<Node> queue =new LinkedList<>();
        queue.add(root); //加入根结点
        while(!queue.isEmpty()){
            size= queue.size();
            List<Integer> sub_result=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node cur=queue.poll();
                sub_result.add(cur.val);
                for(int j=0;j<cur.children.size();j++){ //遍历当前结点的孩子结点们
                    queue.add(cur.children.get(j));
                }
            }
            result.add(sub_result);
        }
        return result;
    }
}
