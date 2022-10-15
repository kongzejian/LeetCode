/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return commonancestor(root,p,q);
    }
    public TreeNode commonancestor(TreeNode root,TreeNode p,TreeNode q){
      if(root==null || root==q ||root==p){
            return root;
        }
        TreeNode p_;  //处理p的值比q的值大的情况，使得每次递归遵循p的值比q的值小的原则
        TreeNode q_;
        if(p.val>q.val){
            p_=q;
            q_=p;
        }
        else{
            p_=p;
            q_=q;
        }
        TreeNode left=null;
        TreeNode right=null;
        if(root.val>p_.val){ //搜寻左孩子，如果存在较小的那个值，left就不是Null
            left=commonancestor(root.left,p_,q_);
        }
        if(root.val<q_.val){ //搜寻右孩子，如果存在较大的那个值，right就不是Null
            right=commonancestor(root.right,p_,q_);
        }
        if(left==null&&right==null){
            return null;
        }
        else if(left!=null&&right==null){
            return left;
        }
        else if(left==null &&right!=null){
            return right;
        }
        else{
            return root;
        }
    }
}
