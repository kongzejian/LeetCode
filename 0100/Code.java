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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }
    public boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null){ //如果都为空结点，相同
            return true;
        }
        if(p==null || q==null){ //有一个是空节点，另一个不是，不相同
            return false;
        }
        if(p.val!=q.val){ //都不是空节点，但是值不相同，不相同
            return false;
        }
        return same(p.left,q.left) && same(p.right,q.right); //本节点相同，分别比较左子树和右子树
    }
}
