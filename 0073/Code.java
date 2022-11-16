class Solution {
    public void setZeroes(int[][] matrix) { //i为行，j为列
         boolean first_row=false;
        boolean first_column=false;
        for(int j=0;j<matrix[0].length;j++){ //第一行有没有0
            if(matrix[0][j]==0){
                first_row=true;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++){ //第一列有没有0
            if(matrix[i][0]==0){
                first_column=true;
                break;
            }
        }
        for(int i=1;i<matrix.length;i++){ //遍历数组，用第一行第一列记录整列整行是否要清零
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //一行一行的看
        for(int i=1;i<matrix.length;i++){ 
            if(matrix[i][0]==0){ //此行清零
                for(int j=1;j<matrix[i].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        //一列一列的看
        for(int j=1;j<matrix[0].length;j++){ 
            if(matrix[0][j]==0){ //此列清零
                for(int i=1;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(first_row){ //清零第一行
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(first_column){ //清零第一列
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}
