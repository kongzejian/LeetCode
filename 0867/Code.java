class Solution {
    public int[][] transpose(int[][] matrix) {
         int length=matrix[0].length;
        int breadth=matrix.length;
        int[][] result=new int[length][breadth];
        for(int i=0;i<breadth;i++){
            for(int j=0;j<length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}
