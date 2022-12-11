class Solution {
    public int maxProfit(int[] prices) {
         int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit; //局部最优，低买高卖，寻找所有正利润的区间
    }
}
