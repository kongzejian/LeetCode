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
    public int count=0; //记录当前有多少重复的元素
    public List<Integer> result=new ArrayList<>(); //答案
    public int pre=Integer.MIN_VALUE; //前一个的数字
    public int max_count=0; //记录目前出现最多的次数
    public int[] findMode(TreeNode root) { //中序遍历
        trasverse(root);
        int[] final_result=new int[result.size()];
        for(int i=0;i<result.size();i++){
            final_result[i]=result.get(i);
        }
        return final_result;
    }
    public void trasverse(TreeNode root){
        if(root==null){
            return;
        }
        trasverse(root.left);
        if(pre==Integer.MIN_VALUE){ //如果是第一个结点，加入结果，count变为1，更新Pre,最多的次数更新为1
            result.add(root.val);
            count++; 
            pre=root.val;
            max_count=count;
        }
        else if(pre==root.val){ //如果和之前一个元素一样，count加一，并与max_count比较
            count++;
            if(count==max_count){ //如果相等，也加入结果
                result.add(root.val);
            }
            else if(count>max_count){ //如果大于，先清空结果，再加入
                result.clear();
                result.add(root.val);
                max_count=count;
            }
        }
        else {
            pre=root.val;
            count=1;
             if(count==max_count){ //防止众数出现的次数是1
                result.add(root.val);
            }
        }
        trasverse(root.right);

    }
}
