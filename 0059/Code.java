class Solution {
    public int[][] generateMatrix(int n) {
      int[][] result = new int[n][n];
        int cur = 1;
        int x = 0;
        int y = 0;
        while (true) {
            while (x < n && result[y][x] == 0) { //往右
                result[y][x] = cur;
                cur++;
                x++;
                if(cur==n*n+1){
                    return result;
                }
            }
            x--; //往左退一步，并往下走
            y++;
            while (y < n && result[y][x] == 0) { //往下
                result[y][x] = cur;
                cur++;
                y++;
                if(cur==n*n+1){
                    return result;
                }
            }
            y--; //往上退一步，并往右走
            x--;
            while (x >= 0 && result[y][x] == 0) { //往左
                result[y][x] = cur;
                cur++;
                x--;
                if(cur==n*n+1){
                    return result;
                }
            }
            x++; //往右退一步，并往上走
            y--;
            while (y >= 0 && result[y][x] == 0) {//往上
                result[y][x] = cur;
                cur++;
                y--;
                if(cur==n*n+1){
                    return result;
                }
            }
            y++; //往下退一步，并往左走
            x++;
        }

    }
}
