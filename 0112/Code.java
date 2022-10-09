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
    public boolean result=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return result;
        }
        backtracking(root,targetSum,0);
        return result;
    }
    public void backtracking(TreeNode root,int targetsum,int sum){  //由于sum不是全局变量，所以回溯操作不用sum减去些什么
          if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum==targetsum){ //如果sum与targetsum相等，将result变为true，返回
                result=true;
            }
            return;
        }
        sum+=root.val;
        if(root.left!=null){
            backtracking(root.left,targetsum,sum);
            if(result){   //剪枝，已经找到一条路径，就没有继续遍历的必要，直接return
                return;
            }
        }
        if(root.right!=null){
            backtracking(root.right,targetsum,sum);
            if(result){ //剪枝
                return;
            }
        }      
    }
}
