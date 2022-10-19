class Solution {
    public int numIslands(char[][] grid) {
        int number=0;
       for(int j=0;j<grid[0].length;j++){
           for(int i=0;i<grid.length;i++){
                if(grid[i][j]=='1'){
                dfs(grid,i,j); //深度优先搜索
                number++;}
           }
       }
       return number;
    }
    public void dfs(char[][] grid,int i,int j){
        if(if_out_of_bound(i,j,grid)||grid[i][j]=='0'){ //越界或者是海洋，返回
            return;
        }
        grid[i][j]='0'; //将遍历过的进行标记
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public boolean if_out_of_bound(int i,int j,char[][] grid){ //先污染后治理，先遍历，再判断有没有越界
        return !(i>=0&&i<grid.length&&j>=0&&j<grid[0].length);
    }
}
