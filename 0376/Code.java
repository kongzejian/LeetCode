class Solution {
    public int wiggleMaxLength(int[] nums) {
    int result=1; //默认最右边有一个峰值
    int prediff=0;
    int curdiff=0;
    for(int i=0;i<nums.length-1;i++){ //从第一个数开始
        curdiff=nums[i+1]-nums[i];
        if((curdiff>0&&prediff<=0)||(curdiff<0&&prediff>=0)){//出现峰值
             prediff=curdiff; //这是之前一直通不过的原因，我把这一行写到if外面了，这就导致一个问题，如果中间的数出现持平的情况，prediff会被更新为0 ，再下一个数判定的时候，result多加1
            result++;
        }
       
    }
        return result;
    }
}
