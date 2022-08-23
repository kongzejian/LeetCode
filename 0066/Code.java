class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1==10){
                digits[i]=0;
            }
            else {
                digits[i]+=1;
                break;

            }
        }
        if(digits[0]!=0){ //考虑最高位也要进位的情况
        return digits;}
        else {
            int[] result=new int[digits.length+1];
            result[0]=1;
            for (int i = 0; i < digits.length; i++) {
                result[i+1]=digits[i];
            }
            return result;
        }
        
    }
}
