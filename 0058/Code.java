class Solution {
    public int lengthOfLastWord(String s) {
         int count = 0;
        int start = s.length() - 1;
        while(start>=0 && Character.isSpaceChar(s.charAt(start))){  //先找到倒数第一个的字母                        //主要是Character.isSpaceChar(字符)的用法，也可以换成==' '  注意单引号且中间要敲一个空格
            start-=1;
        }
        while(start>=0 && !Character.isSpaceChar(s.charAt(start))){ //找到倒数第一个字母前的第一个空格 
            start-=1;
            count+=1;
        }
        return count;
    }
}
