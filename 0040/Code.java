class Solution {
     public List<List<Integer>> result = new ArrayList<>();
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      boolean[] used = new boolean[candidates.length];    //使用过的数组
        Arrays.sort(candidates);                      //这种方法一定要排序
        backtracking(candidates,target,0,0,used);
        return result;
        
    }
        public void backtracking(int[] candidates,int target,int startindex,int sum,boolean[] used) {
        if(sum==target){
            result.add(new ArrayList<>(path));
        }
        for(int i=startindex;i<candidates.length&&(sum+candidates[i]<=target);i++){
            if(i>0&&candidates[i]==candidates[i-1]&& !used[i - 1]){ //不是第一个元素的情况下，和之前的元素相等，且之前的元素未被使用过，说明是同一层，跳过
                continue;
            }
            used[i]=true; //标记已使用
            path.add(candidates[i]); 
            sum+=candidates[i];
            backtracking(candidates,target,i+1,sum,used);
            used[i]=false; //以下是回溯部分，标记未被使用
            Integer remove_item= candidates[i];
            path.remove(remove_item); //从path中移除
            sum-=candidates[i];
        }
        }
}
