class Solution {
    public List<Integer> path=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,used);                      //由于是全排列，不用start_index
        return result;
    }
    public void backtracking(int[] nums,boolean[] used){
        if(path.size()== nums.length){
            result.add(new ArrayList<>(path));            //当path和原数组长度相等时，结束递归，加入答案
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){                                //如果没有被使用过
                path.add(nums[i]);
                used[i]=true;
                backtracking(nums,used);                  //回溯
                used[i]=false;
                path.remove(path.size()-1);
            }
        }

    }
}
