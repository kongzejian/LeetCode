class Solution {
    public int candy(int[] ratings) { //向从左往右遍历，如果左边的小于当前的，当前的左边的基础上加一，否则为1；从右往左遍历，如果右边小于当前的，再做处理
    int result=0;
    int[] Candy=new int[ratings.length];
    Candy[0]=1;
    for(int i=1;i<ratings.length;i++){
        if(ratings[i]>ratings[i-1]){
            Candy[i]=Candy[i-1]+1;
        }
        else{
            Candy[i]=1;
        }
    }
    for(int i=ratings.length-1;i>=1;i--){
        if(ratings[i]<ratings[i-1]){
             Candy[i-1]=Math.max(Candy[i]+1,Candy[i-1]); //如果当前的已经大于Candy[i]+1了，就不用加了，维持原样
        }
    }
    for(int i=0;i<ratings.length;i++){
        result+=Candy[i];
    }
    return result;
    }
}
