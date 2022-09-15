class Solution {
    public int maxProduct(int[] nums) {
    int fmax=nums[0];
    int fmin=nums[0];
    int max=nums[0];
    int t;
    for(int i=1;i<nums.length;i++){
        t=fmax;
        fmax=Math.max(nums[i],Math.max(fmax*nums[i],fmin*nums[i]));
        fmin=Math.min(nums[i],Math.min(t*nums[i],fmin*nums[i]));
        max=Math.max(max,fmax);
    }
    return max;
}
}
