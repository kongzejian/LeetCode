class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] result=new int[2];
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        int left_one=left; //查找大于等于target的第一个数的坐标

        left=0;
        right=nums.length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]>target){
                right =mid-1;
            }
            else{
                left=mid+1;
            }
        }
        int right_one=left-1; //查找第一个大于target数的坐标
        if(right_one>=left_one&&nums[left_one]==target&&nums[right_one]==target&&left_one>=0&&right_one<=nums.length-1){ //判断是否符合要求
            result[0]=left_one;
            result[1]=right_one;
        }
        else{
            result[0]=-1;
            result[1]=-1;
        }
        return result;
    }
}
