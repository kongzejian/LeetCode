class Solution {
    public int search(int[] nums, int target) {
       int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){     //统一 小于等于 左闭右闭区间
            mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            } else if (nums[mid]<target) {
                left=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
