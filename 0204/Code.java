class Solution {
    public int countPrimes(int n) {
         if(n<3){
            return 0;
        }
        int[] num=new int[n+1];
        for(int j=2;j<Math.sqrt(n);j++){ //从2遍历到根号n的数
            if(num[j]==0){  //0表示没有被删除，1表示已经被删除
               for(int r=j;r*j<n;r++){ //删除 j*j j*(j+1)，一直订到n
                   if(num[j*r]==0){ //如果没有被删除，那就删除
                   num[j*r]=1;}
                }
            }
        }
        int result=0;
        for(int j=2;j<n;j++){
            if(num[j]==0){
                result++;//计数没有被删除的
            }
        }
        return result;
    }
}
