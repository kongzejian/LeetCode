class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        int[] tmp=new int[k];
        for(int i=nums.length-1;i>=nums.length-k;i--){
            tmp[i-nums.length+k]=nums[i];
        }                             //将要旋转的复制出来
        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];        //原数组后移
    }
        for(int i=0;i<k;i++){
            nums[i]=tmp[i];          //合并
        }
    }
}
