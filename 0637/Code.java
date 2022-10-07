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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root); //加入跟结点
        while(!queue.isEmpty()){
            size= queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                sum+=cur.val;
                System.out.println(sum);
                if(i==size-1){
                result.add(sum/(double)size); //这道题考类型转换，(double)size 强转
                }
                if(cur.left!=null){
                queue.add(cur.left);}
                if(cur.right!=null){
                queue.add(cur.right);}
            }
        }
        return result;
    }
}
