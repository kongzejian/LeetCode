class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                int area=dfs(grid,i,j); //发现一个岛屿，进行dfs搜索
                max_area=Math.max(max_area,area);
               }
           }
       }
       return max_area;
    }
    public int dfs(int[][] grid,int i,int j){
        if(if_out_of_bound(i,j,grid)||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0; //标记已经遍历过
        int area=1;  
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i-1,j);
        area+=dfs(grid,i,j+1);
        area+=dfs(grid,i,j-1);
        return area;
    }
    public boolean if_out_of_bound(int i,int j,int[][] grid){ //越界判定
        return !(j>=0&&j<grid[0].length&&i>=0&&i<grid.length);
    }
}
