class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int left=1;
        int right=x;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(x/mid<mid){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
}
