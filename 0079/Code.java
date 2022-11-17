class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] marked=new boolean[board.length][board[0].length]; //标记是否访问过
        int index=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(index)){ //遍历数组，找到word[0]的字母，开始深度优先搜索
                    boolean f1=dfs(board,i,j,word,index,marked);
                    if(f1){
                        return true; //表示找到
                    }
                }
            }
        }
        return false;//没找到
    }
    public boolean dfs(char[][] board,int i,int j,String word,int index,boolean[][] marked){
        if(((i<0||j<0||i>= board.length||j>=board[0].length))|| marked[i][j]){ //如果越界，或者已经访问过，返回false
            return false;
        }
        if(index>=word.length()){ //如果index已经超过word的长度，返回false
            return false;
        }
        if(index==word.length()-1&&word.charAt(index)==board[i][j]){ //是word最后一个元素且相等，走到这说明已经完整的找到了
            return true;
        }
        if(word.charAt(index)!=board[i][j]){ //元素不相等，返回false
            return false;
        }
        marked[i][j]=true; //标记已经访问
        index++;
        boolean r1=dfs(board,i-1,j,word,index,marked); //四个方向进行搜索
        boolean r2=dfs(board,i+1,j,word,index,marked);
        boolean r3=dfs(board,i,j-1,word,index,marked);
        boolean r4=dfs(board,i,j+1,word,index,marked);
        marked[i][j]=false; //回溯
        return r1|r2|r3|r4; //返回结果
    }
}
