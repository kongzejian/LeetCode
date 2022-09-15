class Solution {
    public boolean canJump(int[] nums) {
    boolean[] dp=new boolean[nums.length];
    dp[0]=true;
    for(int i=1;i<dp.length;i++){
        for(int j=0;j<i;j++){
            if(dp[i]){
                break;
            }
            else{
            dp[i]=(dp[j] && (i-j)<=nums[j])||dp[i];}
        }
    }
    return dp[nums.length-1];
    }
}
