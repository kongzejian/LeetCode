class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row_location=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[0].length-1]>=target){
                break;
            }
            else{
                row_location++;
            }
        }                                     //其实列内也可以使用二分查找，但并没有使用
        if(row_location>= matrix.length){
            return false; //target比最后一行最后一个元素还要大，return false
        }
        //在行内使用二分查找
        int left=-1;
        int right= matrix[0].length;
        int mid=left+(right-left)/2;
        while(left+1!=right){
            mid=left+(right-left)/2;
            if(matrix[row_location][mid]<=target){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        if(left==-1){ //当target小于第一个元素，Left为-1，需要另外考虑
            return false;
        }
        return matrix[row_location][left]==target; //left指向最右边小于等于target的值
    }
}
