class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int count=0;
        int i=0;
        int j=0;
        while(count<matrix[0].length*matrix.length) {
            while (j< matrix[0].length && matrix[i][j] != 101) { //左 由于元素数值为-100-100，用101标记为已经访问过
                result.add(matrix[i][j]);
                matrix[i][j] = 101;
                count++;
                j++;
            }
            j--; //退回
            i++;
            while (i< matrix.length && matrix[i][j] != 101) { //下
                result.add(matrix[i][j]);
                matrix[i][j] = 101;
                count++;
                i++;
            }
            i--;
            j--;
            while (j>= 0 && matrix[i][j] != 101) { //右
                result.add(matrix[i][j]);
                matrix[i][j] = 101;
                count++;
                j--;
            }
                j++;
                i--;
            while (i>= 0 && matrix[i][j] != 101) { //右
                result.add(matrix[i][j]);
                matrix[i][j] = 101;
                count++;
                i--;
            }
            i++;
            j++;
        }
        return result;
    }
}
