class Solution { //快速幂算法
    public double myPow(double x, int n) {
        double result=1.0;
        int f=n;
        while(f!=0){
            if((f&1)==1){
                result*=x;
            }
            x*=x; //自乘
            f/=2;
        }
        return n<0?1/result:result; //如果n是负数，取倒数
    }
}
