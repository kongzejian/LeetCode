class Solution {
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used=new boolean[nums.length];
        Arrays.sort(nums);   //排序
        backtracking(nums,used);
        return result;
    }
    public void backtracking(int[] nums,boolean[] used){
        if(path.size()== nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if((i>0&&nums[i-1]==nums[i]&&!used[i-1])||used[i]){  //如果不是第一个元素，和前一个元素值相同且前一个元素没有使用过，说明是树层去重
                continue;
            }
            else{
                path.add(nums[i]);
                used[i]=true;
                backtracking(nums,used); 
                path.remove(path.size()-1); //回溯
                used[i]=false;
            }
        }
    }
}
