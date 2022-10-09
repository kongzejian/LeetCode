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
class Solution { //112题用了回溯，在此基础上增加path,修改即可
    public  List<List<Integer>> result=new ArrayList<>();
    public  List<Integer> path=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return result;
        }
        backtracking(root,targetSum,0);
        return result;
    }
    public void backtracking(TreeNode root,int targetsum,int sum){
        if(root.left==null && root.right==null){
            sum+=root.val;
            path.add(root.val);
            if(sum==targetsum){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        sum+=root.val;
        path.add(root.val);
        if(root.left!=null){
            backtracking(root.left,targetsum,sum);
            path.remove(path.size()-1); //回溯
        }
        if(root.right!=null){
            backtracking(root.right,targetsum,sum);
            path.remove(path.size()-1); //回溯
        }
    }
}
