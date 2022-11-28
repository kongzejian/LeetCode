class Solution { //之前一直用的很爽的二分查找模板在这一题出现了较大的问题，因为left指针一开始指向-1，而需要比较mid和left的值来确定是否有序，最小值必定出现在无序的子序列中
    public int findMin(int[] nums) {
    int left=-1;
    int right=nums.length;
    int mid;
    while(left+1!=right){
        mid=left+(right-left)/2;
        if(left==-1){ //如果left为-1
            if(nums[mid]>=nums[left+1]){//比较left+1和mid
                left=mid; //无序序列在右侧
            }
            else{
                right=mid; //无序序列在左侧
            }
        }
        else{
            if(nums[mid]>=nums[left]){
                left=mid;
            }
            else{
                right=mid;
            }
        }
    }
   if(right==nums.length){ //说明整个序列都是有序的，返回第一个数字
        return nums[0];
    }
    else{
    return nums[right];}
    }
}
