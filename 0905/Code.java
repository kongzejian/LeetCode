class Solution {
    public int[] sortArrayByParity(int[] nums) {
      if(nums.length==1){
            return nums;
        }
        int pre=0;
        int post=nums.length-1;
        while(pre<post){
            while(nums[pre]%2==0){
                pre+=1;     //从前往后，找奇数
                if(pre==post){
                    return nums; //如果相遇，返回
                }
            }
            while(nums[post]%2==1){
                post-=1;   //从后往前找偶数
                if(post==pre){
                    return nums;
                }
            }
            int temp=nums[pre];
            nums[pre]=nums[post];
            nums[post]=temp; //交换
            pre+=1;
            post-=1;
             if(pre==post){
                break;
            }
        }
        return nums;
    }
}
