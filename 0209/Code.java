 public static int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            if(sum<target){ //如果窗口内的和小于target，往右扩大窗口长度
                end++;
            }
            else{ //如果窗口的和大于等于target
                while(sum-nums[start]>=target){ //检查是否能将左侧的元素移出窗口
                    sum-=nums[start];
                    start++;
                }
                ans=Math.min(end-start+1,ans); //更新ans的值
                end++;
            }

        }
        if(sum<target){
            return 0;
        }
        else{
        return ans;}
    }
