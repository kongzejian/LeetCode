class Solution {
    public List<List<Integer>> result=new ArrayList<>();
     public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used= new boolean[nums.length]; //标记是否访问过
        Arrays.sort(nums);
        backtracking(nums,0,used);
        return result;
    }
    public void backtracking(int[] nums,int startindex,boolean[] used){
        if(startindex>nums.length){
            return;
        }
        result.add(new ArrayList<>(path)); //添加结点
        for(int i=startindex;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false){ //树层去重
                continue;
            }
            used[i]=true;
            path.add(nums[i]);
            backtracking(nums,i+1,used); //回溯
            used[i]=false;
            path.remove(path.size()-1);
        }

    }
}
