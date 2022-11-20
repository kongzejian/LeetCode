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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
   List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
    boolean flag=false;
    Deque<TreeNode> queue=new ArrayDeque<>();
    queue.addFirst(root);
    int length;
    while(!queue.isEmpty()) {
        length=queue.size();
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (!flag) { //从右往左
            TreeNode cur = queue.pollLast();
            path.add(cur.val);
                if(cur.left!=null){
                queue.addFirst(cur.left);}
                if(cur.right!=null){
                queue.addFirst(cur.right);}
            } else //从左往右
            {   TreeNode cur = queue.pollFirst();
                path.add(cur.val);
                if(cur.right!=null){
                    queue.addLast(cur.right);}
                if(cur.left!=null){
                queue.addLast(cur.left);}

            }
        }
        if(flag){
            flag=false;
        }
        else{
            flag=true;
        }
        result.add(path);
    }
    return result;
}
}
