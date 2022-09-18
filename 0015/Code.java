class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int target;
        int left;
        int right;
        int tmp;
        int big_t=0;
        int t_left;
        int t_right;
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 &&nums[big_t]==nums[i]){
                continue;              //第一个数如果和前面一个一样，就不停后移
            }
            target=-nums[i];
            left=i+1;
            right=nums.length-1; //二指针
            while(left<right){
                if((nums[left]+nums[right])>target){ //和大于目标值，右指针右移
                    tmp=right;
                    right-=1;
                    while((nums[tmp]==nums[right])&&left<right){ //如果一样移动后还是和移之前一样，右指针就一直右移
                        right-=1;
                    }
                }
                else if(((nums[left]+nums[right])<target)){  //和小于目标值，左指针左移
                    tmp=left;
                    left+=1;
                    while ((nums[tmp]==nums[left])&&left<right){ //如果一样移动后还是和移之前一样，左指针就一直左移
                        left+=1;
                    }
                }
                else{
                    List<Integer> t=new ArrayList<>(); //和为目标值，添加到结果
                    t.add(nums[i]);
                    t.add(nums[left]);
                    t.add(nums[right]);
                    result.add(t);
                    t_left=left;
                    t_right=right;
                    left+=1;
                    right-=1;
                    while ((nums[t_left]==nums[left])&&left<right){  //如果一样移动后还是和移之前一样，左指针就一直左移
                    left+=1;}
                    while ((nums[t_right]==nums[right])&&left<right){ //如果一样移动后还是和移之前一样，右指针就一直右移
                    right-=1;}
                }
            }
            big_t=i;
        }
        return result;
    }
}
