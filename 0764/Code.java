class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
//每爬到一个楼梯都需要支付那个楼梯的费用，不管是上一阶还是上两阶，初始化：dp[i]爬到i阶所花的最小费用，dp[i]=min(dp[i-1],dp[i-2])+cost[i]，可以从第i-1爬上来，也可以从i-2爬上来，
//取最小值，自己本身的费用也必须加上。最后返回的结果，最后一阶不用付钱，所以取倒数第二阶和倒数第一阶的最小值
