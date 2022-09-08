class Solution {
    public int uniquePaths(int m, int n) {
        int[][] f=new int[m][n];
        for(int i=0;i<m;i++){
            f[i][0]=1; //第一行只能一直往右走 一种方法
        }
        for(int i=0;i<n;i++){
            f[0][i]=1; //第一列只能一直往下走 一种方法
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                f[i][j]=f[i-1][j]+f[i][j-1]; //转移方程 
            }
        }
        return f[m-1][n-1];
    }
}
