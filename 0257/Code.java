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
    public List<String> result=new ArrayList<>();
    public List<String> path=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        backtracking(root);
        return result;
    }
    public void backtracking(TreeNode root){
        if(root.left==null && root.right==null){ //如果为叶子结点
            String path_t="";
            path.add(String.valueOf(root.val)); //将本节点加入path中
            for(int i=0;i<path.size()-1;i++){   //将path转化为string类型的path_t，并添加->符号，注意最后一个元素后面没有符号
                path_t+=path.get(i);
                path_t+="->";
            }
            path_t+=path.get(path.size()-1); //添加最后一个元素
            result.add(new String(path_t));//添加入结果中
            return;
        }
        path.add(String.valueOf(root.val));
        if(root.left!=null){
            backtracking(root.left);
            path.remove(path.size()-1);  //回溯
        }
        if(root.right!=null){
            backtracking(root.right); 
            path.remove(path.size()-1);//回溯
        }
    }
}
