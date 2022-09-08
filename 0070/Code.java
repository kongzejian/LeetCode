class Solution {
    public int climbStairs(int n) {
         int[] f=new int[n+1];  //0-n一共你n+1的容量
        f[1]=1;                 //爬一阶楼梯就1个方法
        f[0]=1;                 //爬两阶楼梯
        if (n > 1) {
            for (int i = 2; i < n + 1; i++) {
                f[i] = f[i - 1] + f[i - 2]; //转移方程
            }
        }
        return f[n];

    }
}
