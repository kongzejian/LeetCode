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
    public List<TreeNode> generateTrees(int n) {
         return generate(1,n);
    }
     public List<TreeNode> generate(int start,int end){
        List<TreeNode> all=new ArrayList<>();
        if(start>end){ //递归终止条件
            all.add(null);
            return all;
        }
        for(int i=start;i<=end;i++){

            List<TreeNode> left=generate(start,i-1); //左子树的所有可能
            List<TreeNode> right=generate(i+1,end); //右子树的所有可能
            for(int m=0;m<left.size();m++){
                for(int n=0;n<right.size();n++){
                    TreeNode root=new TreeNode(i); //根结点
                    root.left=left.get(m);
                    root.right=right.get(n);
                    all.add(root); //添加入答案中
                }
            }
        }
       return all;
}
}
