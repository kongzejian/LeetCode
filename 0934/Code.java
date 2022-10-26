class Solution {
    public Queue<int[]> island=new LinkedList<>(); //存放岛屿的队列
    public int shortestBridge(int[][] grid) {
         int result=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        int flag=0;
    for(int j=0;j<grid[0].length;j++){ //这个循环是找到第一块岛屿，采用深度优先搜搜
        for(int i=0;i<grid.length;i++){
            if(grid[i][j]==1){
                dfs(grid,i,j);
                flag=1;
                break;
            }
        }
        if(flag==1){
            break;
        }
    }
    //找到第一个岛屿后，使用广度优先搜索寻找第二个岛屿
    while(!island.isEmpty()){
        int k=island.size(); //每一层的遍历
    for(int i=0;i<k;i++){
            int[] cur=island.poll();
            int i_t=cur[0];
            int j_t=cur[1];
            for(int c=0;c<4;c++){ //广度优先
                int ni=i_t+dir[c][0];
                int nj=j_t+dir[c][1];
                if(ni>=grid.length||ni<0||nj>=grid[0].length||nj<0||grid[ni][nj]==-1){
                    continue;
                }
                else if(grid[ni][nj]==0){
                    grid[ni][nj]=-1;
                    island.add(new int[]{ni,nj});
                }
                else{ //找到陆地
                    return result;
                }
            }
        }
        result++; //广度优先每一层result加一
    }
    return 0;
}
 public void dfs(int[][] grid,int i,int j){ //深度优先搜索
        if(j>=grid[0].length||j<0||i>=grid.length||i<0||grid[i][j]==-1||grid[i][j]==0){
            return;
        }
        island.add(new int[]{i,j});
        grid[i][j]=-1;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
