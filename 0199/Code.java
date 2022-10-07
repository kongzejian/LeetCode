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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root); //加入跟结点
        while(!queue.isEmpty()){
            size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(i==size-1){     //先用层序遍历写，增加这一行，只将每层最后一个元素添加进结果
                result.add(cur.val);}
                if(cur.left!=null){
                queue.add(cur.left);}
                if(cur.right!=null){
                queue.add(cur.right);}
            }
        }
        return result;
    }
}
