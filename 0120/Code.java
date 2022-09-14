class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    List<List<Integer>> dp=new ArrayList<>();
    for(int i=0;i<triangle.size();i++){
        List<Integer> t=new ArrayList<>();
        dp.add(t);
    }

    if(triangle.size()==1){
        return triangle.get(0).get(0); //如果只有一行
    }
    //初始化所有行的第一个元素
    dp.get(0).add(triangle.get(0).get(0));
    for(int i=1;i<triangle.size();i++){
        dp.get(i).add(triangle.get(i).get(0)+dp.get(i-1).get(0));
    }
     //第二行的第二个元素
    dp.get(1).add(triangle.get(1).get(1)+dp.get(0).get(0));
     //开始遍历
    for(int i=2;i<triangle.size();i++){
        for(int j=1;j<triangle.get(i).size();j++){
          //每一行最后一个元素单独考虑
            if(j!=triangle.get(i).size()-1){
            dp.get(i).add(Math.min(dp.get(i-1).get(j),dp.get(i-1).get(j-1))+triangle.get(i).get(j));}
            else {
                dp.get(i).add(dp.get(i-1).get(j-1)+triangle.get(i).get(j));
            }
        }
    }
      //获得最后一行的最小值
    int min=Integer.MAX_VALUE;
    for(int i=0;i<triangle.size();i++){
        if(min>dp.get(triangle.size()-1).get(i)){
            min=dp.get(triangle.size()-1).get(i);
        }
    }
    return min;
    }
}
