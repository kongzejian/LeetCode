class Solution {
    public int removeElement(int[] nums, int val) {
         if(nums.length==0 || (nums.length==1 && nums[0]==val)){
            return 0;
        }
        if(nums.length==1 && nums[0]!=val){
            return 1;
        }
        int pre_index=0;
        int post_index=1;
        while(true){
            if(post_index>nums.length){
                return pre_index;
            }
            if(nums[pre_index]==val){
                while(post_index<nums.length && nums[post_index]==val ){
                    post_index+=1;
                }
                if(post_index>nums.length-1){
                    return pre_index;
                }
                int temp=nums[post_index];
                nums[post_index]=nums[pre_index];
                nums[pre_index]=temp;
            }
            pre_index+=1;
            post_index+=1;
        }
    }
}
