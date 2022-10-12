//自己的代码：
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
    public LinkedList<Integer> node=new LinkedList<>(); //中序遍历，把结果放入一个list，再查找List里的最小差值，由于是二叉搜索树，List单调递增
    public int getMinimumDifference(TreeNode root) {
        trasverse(root);
        int result=Integer.MAX_VALUE;
        for(int i=1;i<node.size();i++){
            result=Math.min(result,Math.abs(node.get(i)-node.get(i-1)));
        }
        return result;
    }
    public void trasverse(TreeNode root){
        if(root==null){
            return;
        }
        trasverse(root.left);
        node.add(root.val);
        trasverse(root.right);
    }
}


//官方代码：
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
    public int result=Integer.MAX_VALUE; //也是采用中序遍历，用一个pre全局变量记录上一个结点，节省空间复杂度和时间复杂度
    public int pre;
    public int getMinimumDifference(TreeNode root) {
        pre=-1;
        trasverse(root);
        return result;
    }
    public void trasverse(TreeNode root){
        if(root==null){
            return;
        }
        trasverse(root.left);
        if(pre==-1){
            pre=root.val;
        }
        else{
            result=Math.min(result,root.val-pre);
            pre=root.val;        }

        trasverse(root.right);

    }
}
