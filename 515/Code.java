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
    public List<Integer> largestValues(TreeNode root) {
         List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root); //加入根结点
        while(!queue.isEmpty()){
            size= queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                max=Math.max(max,cur.val); //更新每层的最大值
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            result.add(max); //加入答案中
        }
        return result;
    }
}
