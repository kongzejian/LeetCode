class Solution {//简单题我重拳出击
    public int titleToNumber(String columnTitle) {
         int result=0;
        int current;
        int j=1;
    for(int i=columnTitle.length()-1;i>=0;i--){
        current=columnTitle.charAt(i)-'A'+1; //当前数位
        result+=current*j; //加入result
        j=j*26; //26进制
    }
    return result; 
    }
} 
