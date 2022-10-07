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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        int size;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root); //加入跟结点
        while(!queue.isEmpty()){
            List<Integer> sub_result=new ArrayList<>();
            size= queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                sub_result.add(cur.val);
                if(cur.left!=null){
                queue.add(cur.left);}
                if(cur.right!=null){
                queue.add(cur.right);}

            }
            result.add(sub_result);
        }
        //对结果进行反转，就是从下而上的遍历结果了
        List<List<Integer>> result2=new ArrayList<>();
        for(int i=result.size()-1;i>=0;i--){
            result2.add(result.get(i));
        }
        return result2;
    }
}
