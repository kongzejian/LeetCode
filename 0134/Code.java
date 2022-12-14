class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int rest_every_day=0;
        int min=Integer.MAX_VALUE;
    for(int i=0;i< gas.length;i++){
        rest_every_day=gas[i]-cost[i];
        sum+=rest_every_day;
        min=Math.min(min,sum);
    }
    if(sum<0){ //第一种情况，邮箱里的油的和小于消耗的油的和
        return -1;
    }
    else if(min>=0){ //油箱剩的油始终大于等于0,起始点为0 
        return 0;
    }
    else{
        for(int i= gas.length-1;i>=0;i--){ //从后向前遍历，哪一个位置能将负数填平
            min+=(gas[i]-cost[i]);
            if(min>=0){
                return i;
            }
        }
    }
    return -1;
    }
}
