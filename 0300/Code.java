class Solution {
    public int lengthOfLIS(int[] nums) {
    int[] dp=new int[nums.length];
    dp[0]=1;
    int max;
    int final_result=1;
    for(int i=1;i<nums.length;i++){
        max=1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                max=Math.max(max,dp[j]+1);
            }
        }
        dp[i]=max;
        final_result=Math.max(final_result,max);
    }
    return final_result;
    }
}
