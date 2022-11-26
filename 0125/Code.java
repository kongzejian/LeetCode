class Solution {
    public boolean isPalindrome(String s) {
    int left=0;
    int right=s.length()-1;
    String head;
    String tail;
    while(left<right){
        while((left<right)&&!((s.charAt(left)>='a'&&s.charAt(left)<='z')||(s.charAt(left)>='A'&&s.charAt(left)<='Z')||s.charAt(left)>='0'&&s.charAt(left)<='9')){ //数字字符也算，被坑死了
            left++;
        }
        while(right>left&&(!((s.charAt(right)>='a'&&s.charAt(right)<='z')||(s.charAt(right)>='A'&&s.charAt(right)<='Z')||s.charAt(right)>='0'&&s.charAt(right)<='9'))){
            right--;
        }
        head=s.substring(left,left+1).toLowerCase(); //转换为小写
        tail=s.substring(right,right+1).toLowerCase();
        if(!(head.equals(tail))){ //如果值不等。则返回false
            return false;
        }
        left++;
        right--;
    }
    return true; 
    }
}
