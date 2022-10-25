class Solution {
    public boolean isUgly(int n) {
         if(n==1){
            return true; //1是丑数
        }
        else if(n<=0){ //小于等于0肯定不是丑数
            return false;
        }
        while(n>1){ //是否能被2 3 5整除
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
