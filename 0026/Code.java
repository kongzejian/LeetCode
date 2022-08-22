class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int pre_index=0;
        int post_index=1;
            while(true){
                while(nums[post_index]<=nums[pre_index]){
                    post_index+=1;
                    if(post_index>=nums.length){
                        return pre_index+1;
                    }
                }
                nums[pre_index+1]=nums[post_index];
                pre_index+=1;
        }
    }
}
//思路是双指针，由于数组的有序的，post_index寻找比当前指针更大的，将此元素放到pre_index后面的位置，直到搜索完毕
