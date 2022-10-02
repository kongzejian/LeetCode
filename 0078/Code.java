class Solution {
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return result;
    }
    public void backtracking(int[] nums,int start_index){
        result.add(new ArrayList<>(path));    //这个操作就是把每个结点都添加进入结果
        if(start_index>nums.length-1){
            return;
        }
        for(int i=start_index;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1); //回溯
            Integer remove= nums[i];
            path.remove(remove);
        }

    }
}
