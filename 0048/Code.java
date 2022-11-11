class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i=0;i<matrix.length/2;i++){ //上下颠倒
            for(int j=0;j<matrix[0].length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j]=temp;
            }
        }
        //对角交换
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
