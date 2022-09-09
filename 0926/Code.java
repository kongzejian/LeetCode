class Solution {
    public int minFlipsMonoIncr(String s) {
        int[][] dp=new int[s.length()+1][2];
        dp[0][0]=0;
        dp[0][1]=0;
        for(int i=1;i<s.length()+1;i++){
            dp[i][0]=dp[i-1][0]+(s.charAt(i-1)=='0'?0:1);
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+(s.charAt(i-1)=='1'?0:1);
        }
        return Math.min(dp[s.length()][1],dp[s.length()][0]);
    }
}

//优化版：
class Solution {
    public int minFlipsMonoIncr(String s) {
       int dp_0=0;
        int dp_1=0;
        int t;
        for(int i=1;i<s.length()+1;i++){
            t=dp_0;
            dp_0=dp_0+(s.charAt(i-1)=='0'?0:1);
            dp_1=Math.min(t,dp_1)+(s.charAt(i-1)=='1'?0:1);
        }
        return Math.min(dp_0,dp_1);
    }
}
