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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<TreeNode> queue =new LinkedList<>();  //辅助队列，先进先出
        queue.add(root); //加入根结点
        while(!queue.isEmpty()){
            List<Integer> sub_result=new ArrayList<>();
            size= queue.size();   
            for(int i=0;i<size;i++){  //这个for循环是精髓，之前没想到怎么处理一层的放在一个子集里面
                TreeNode cur=queue.poll();
                sub_result.add(cur.val);
                if(cur.left!=null){
                queue.add(cur.left);}
                if(cur.right!=null){
                queue.add(cur.right);}

            }
            result.add(sub_result);
        }
    return result;
    }
}
