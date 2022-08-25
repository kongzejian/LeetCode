class Solution {
    public int maxProfit(int[] prices) {
       int[][] dp=new int[prices.length][2];
       dp[0][0]=-prices[0]; //持有
       dp[0][1]=0;//不持有
       for(int i=1;i<prices.length;i++){
           dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
           dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
       }
       return dp[prices.length-1][1];

    }
}


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
