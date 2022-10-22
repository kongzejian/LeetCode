class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i); //添加数组元素，索引值
            }
            else{
                if((i-map.get(nums[i]))<=k){ //有重复元素，检查索引差
                    return true;
                }
                else{
                    map.replace(nums[i],i); //处理 nums={1,0,1,1} k=1的情况，需要把索引值更新到最大索引
                }
            }
        }
        return false;
    }
}
