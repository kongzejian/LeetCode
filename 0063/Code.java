class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid[0].length && obstacleGrid[0][i]==0;i++){
            dp[0][i]=1;
        }
        for(int i=0;i<obstacleGrid.length && obstacleGrid[i][0]==0;i++){
                dp[i][0]=1;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]!=1){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];}
                else {
                    dp[i][j]=0;
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}

//学会的点：数组不初始化默认元素都为0，for循环第二个条件要好好利用
