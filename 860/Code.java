class Solution {
    public boolean lemonadeChange(int[] bills) {
       int five=0;
       int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five+=1;
            } else if (bills[i]==10) {
                if(five==0){
                    return false;
                }
                else {
                    five=five-1;
                    ten=ten+1;
                }
            }
            else {
                if(five>=1 && ten>=1){
                   five=five-1;
                    ten=ten-1;
                } else if (five>=3 && ten==0) {
                    five=five-3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
