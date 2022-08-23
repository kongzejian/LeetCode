class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>(numRows);
        List<Integer> row_1=new ArrayList<>(1);
        row_1.add(0,1);
        result.add(0,row_1);
        if(numRows==1){
            return result;}
        int count=2;
        while(count<=numRows)
        {
            List<Integer> row_count=new ArrayList<>(count);
            row_count.add(0,1); //第一个元素是1
            List<Integer> last_row=result.get(count-2);
            for(int i=1;i<count-1;i++){
                row_count.add(i,last_row.get(i-1)+last_row.get(i)); //中间的元素由上一行计算得来
            }
            row_count.add(count-1,1); //最后一个元素也是1 
            result.add(count-1,row_count);
            count+=1;
        }
        return result;
    }
}
