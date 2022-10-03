class Solution {
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
         backtracking(nums,0);
         return result;
    }
     public void backtracking(int[] nums,int start_index){
        if(path.size()>1){
            result.add(new ArrayList<>(path));
        }
        Set<Integer> used = new HashSet<>();
        for(int i=start_index;i<nums.length;i++){
            if((!path.isEmpty()&& nums[i]<path.get(path.size()-1))||used.contains(nums[i])){ //如果在本层已经使用过，或者比上一个存入path还小，跳过
                continue;
            }
            else {
                path.add(nums[i]);
                used.add(nums[i]); //使用过的数字
                backtracking(nums,i+1); //回溯
                Integer remove=nums[i];
                path.remove(remove);
            }
        }

    }
}
