class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        if (nums[0]>nums[1]) //大于等于
        {
            for (int i = 1; i < nums.length - 1; i++) {
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }

        else if (nums[0]<nums[1]) {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }
        else {
            return isMonotonic(Arrays.copyOfRange(nums,1,nums.length));
        }
        return true;
    }
}
