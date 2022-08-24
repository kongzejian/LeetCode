class Solution {
    public List<Integer> getRow(int rowIndex) {
              List<List<Integer>> result=new ArrayList<>(rowIndex+1);
            List<Integer> row_1=new ArrayList<>(1);
            row_1.add(1);
            result.add(row_1);
            if(rowIndex==0){
                return result.get(0);}
            int count=1;
            while(count<=rowIndex)
            {
                List<Integer> row_count=new ArrayList<>(count+1);
                row_count.add(1); 
                List<Integer> last_row=result.get(count-1);
                for(int i=1;i<count;i++){
                    row_count.add(last_row.get(i-1)+last_row.get(i)); //中间的元素由上一行计算得来
                }
                row_count.add(1); 
                result.add(row_count);
                count+=1;
            }
            return result.get(rowIndex);
    }
}
