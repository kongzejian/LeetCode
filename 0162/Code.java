class Solution {
    public int findPeakElement(int[] nums) {
      int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (compare(nums, mid) == 1) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left-1; //需要的边界，红色区域，不往左爬的那个，红色区域为往右爬或我就是峰值
    }
     public int compare(int[] nums,int mid){ //0 代表峰值，1代码往左爬,-1代表往右爬
        if(mid+1>nums.length-1&&mid-1<0){ //考虑边界情况，两边都越界
            return 0; //nums[mid]最大
        }
        else if(mid+1>nums.length-1){ //左边越界
            return nums[mid]>nums[mid-1]?0:1;
        }
        else if(mid-1<0){ //右边越界
            return nums[mid]>nums[mid+1]?0:-1;
        }
        else{
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){ //不越界
                return 0;
            }
            else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
                return -1;
            }
            else{
                return 1;
            }
        }

    }
}
