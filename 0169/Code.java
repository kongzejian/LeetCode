class Solution {
    public int majorityElement(int[] nums) { //同归于尽法，由于多数元素大于1/2的数量，所以如果遇到不一样的就消掉，多数元素的count必定大于0
    int majority=nums[0];
    int count=1; //记录多数元素的个数（与其他元素消掉以后）
    for(int i=1;i<nums.length;i++){
        if(nums[i]==majority){ 
            count++; 
        }
        else{
            count--;
            if(count==0){
                majority=nums[i];
                count=1;
            }
        }
    }
    return majority;
}
}
