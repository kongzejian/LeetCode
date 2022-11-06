class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=-1;
        int right=letters.length;
        int mid;
        while(left+1!=right){
            mid=(left+right)/2;
            if(letters[mid]<=target){ //左边那组是小于等于target，右边那组是大于target
                left=mid;
            }
            else{
                right=mid;
            }
        }
        if(right==letters.length){ //全是左边那组，由于z比a小，循环的，返回第一个元素
            return letters[0];
        }
        else{
        return letters[right];} //返回右边那组最左侧元素
    }
}
