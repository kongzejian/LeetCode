/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
       Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int size;
        LinkedList<Integer> result=new LinkedList<>();
        while(!queue.isEmpty()){
            result.clear(); //层序遍历，每次清空这一层元素的值，当循环退出时，result当中存放着最深层的元素
            size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                result.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
        }
        return result.get(0); //取第一个元素（最左边的）
    }
}
