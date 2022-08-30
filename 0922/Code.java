class Solution {
    public int[] sortArrayByParityII(int[] nums) {
          int j;
        int tmp;
        for(int i=0;i<nums.length-1;i++){
            if(i%2==0 && nums[i]%2==1){
                j=i+1;
                while (nums[j]%2!=0){
                    if(j>nums.length-1){
                        break;
                    }
                    j+=1;
                }
                tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            } else if (i%2==1 && nums[i]%2==0) {
                j=i+1;
                while (nums[j]%2==0){
                    if(j>nums.length-1){
                        break;
                    }
                    j+=1;

                }
                tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
        }
        return nums;
    }
}
