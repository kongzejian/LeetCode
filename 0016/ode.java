class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left;
        int right;
        int sum;
        int result=nums[0]+nums[1]+nums[2]; //记录当前最优解
        for(int i=0;i<nums.length-2;i++){
            left=i+1;
            right= nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right]; //当前和
                if(Math.abs(sum-target)<Math.abs(result-target)){ //如果当前和与target更接近，就将答案更新为当前sum
                    result=sum;
                }
                if(sum>target){
                    right-=1;
                }
                else if(sum<target){
                    left+=1;
                }
                else{
                    return sum;
                }
            }
        }
        return result;
    }
}
