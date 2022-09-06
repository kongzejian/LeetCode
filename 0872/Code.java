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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sq1=new ArrayList<>();
            all_leaf(root1,sq1);
            List<Integer> sq2=new ArrayList<>();
            all_leaf(root2,sq2);
            return sq1.equals(sq2);
    }
   public void all_leaf(TreeNode root, List<Integer> result){
            if(root.left==null && root.right==null){
                result.add(root.val); //是叶子结点，添加进result
            }
            else{
                if(root.left!=null){ //先遍历左
                    all_leaf(root.left,result);}
                if(root.right!=null) { //后遍历右
                    all_leaf(root.right,result);
                }
        }
        }
}
