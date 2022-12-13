class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
    Arrays.sort(nums);
    int pointer=0;
    int result=0;
    int temp;
    while(pointer<nums.length&&nums[pointer]<0&&k>0){ //把负数变为正数
        temp=nums[pointer];
        nums[pointer]=temp*(-1);
        pointer++;
        k--; //尽可能地把绝对值大的负数变正
    }
    if(k==0||(k%2==0&&k>0)){
        for(int i=0;i<nums.length;i++){ //如果k=0或者k大于0，为偶数，全部加起来
            result+=nums[i];
        }
    }
    else{ //k>0且奇数，要把绝对值最小的变为负数
            Arrays.sort(nums);
            result-=nums[0];
            for(int i=1;i<nums.length;i++){
                result+=nums[i];
            }
        }
    return result;
    }
}
