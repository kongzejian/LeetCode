class Solution {
    public boolean isPerfectSquare(int num) {
       int left=1;
        int right=num;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(num/mid==mid && num%mid==0){  //特殊考虑5/2=2 但是5不是2的平方数
                return true;
            }
            else if(num/mid<mid){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
