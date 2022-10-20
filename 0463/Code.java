class Solution {
    public int perimeter=0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        return perimeter;
    }
    public void dfs(int[][] grid,int i,int j){
        if(if_out_of_bound(i,j,grid)||grid[i][j]==0){
            perimeter++;
            return;       //碰到边界或海洋
        }
        if(grid[i][j]==-1){ //已经遍历过的
            return;
        }
        grid[i][j]=-1;
        dfs(grid,i+1,j); //标记已经遍历过了
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public boolean if_out_of_bound(int i,int j,int[][] grid){ //判断边界
        return !(i>=0&&j>=0&&i<grid.length&&j<grid[0].length);
    }
}
