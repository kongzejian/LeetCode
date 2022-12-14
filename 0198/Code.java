class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
    int[] dp=new int[nums.length];
    dp[0]=nums[0];
    dp[1]=nums[1];
    int max_pre=nums[0];
    for(int i=2;i< dp.length;i++){
        max_pre=Math.max(max_pre,dp[i-2]); //max_pre是前一个的所有之前dp中最大值
        dp[i]=Math.max(dp[i-1],max_pre+nums[i]);
    }
    return dp[dp.length-1];
    }
}
