class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);                           //剪枝，先排序
        backtracking(candidates,target,0,0);
        return result;
    }
    public void backtracking(int[] candidates,int target,int startindex,int sum) {
        if(sum==target){
            result.add(new ArrayList<>(path)); //满足条件，加入答案中
        }
        for(int i=startindex;i<candidates.length&&(sum+candidates[i]<=target);i++){ //剪枝，如果加了以后已经大于sum，就不遍历
            path.add(candidates[i]);
            sum+=candidates[i];
            backtracking(candidates,target,i,sum);
            Integer remove_item= candidates[i];
            //回溯部分
            path.remove(remove_item);
            sum-=candidates[i]; //这一步别忘
        }
        }
}
