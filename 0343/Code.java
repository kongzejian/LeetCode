class Solution {
    public int integerBreak(int n) {
       int[] dp=new int[n+1];
        dp[2]=1; //f(2)=1，f(2)才有意义
        for(int i=3;i<=n;i++){
            int relative_large;
            for(int j=1;j<i-1;j++){
                relative_large=Math.max(j*(i-j),dp[i-j]*j);
                dp[i]=Math.max(dp[i],relative_large);
            }
        }
        return dp[n];
    }
}
//,f(i)是i可以拆分后乘积最大的结果，dp[10] 有两种方式得到，k*(10-k)和k*dp[10-k]，遍历k从1到8，分为两种：1.两个数或两个以上的数
