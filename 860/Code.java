class Solution {
    public boolean lemonadeChange(int[] bills) {
       int[] money_have=new int[]{0,0}; //数组第一个是5元的个数，第二个元素是10元的个数
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                money_have[0]+=1;
            } else if (bills[i]==10) {
                if(money_have[0]==0){
                    return false;
                }
                else {
                    money_have[0]=money_have[0]-1;
                    money_have[1]=money_have[1]+1;
                }
            }
            else {
                if(money_have[0]>=1 && money_have[1]>=1){
                    money_have[0]=money_have[0]-1;
                    money_have[1]=money_have[1]-1;
                } else if (money_have[0]>=3 && money_have[1]==0) {
                    money_have[0]=money_have[0]-3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
