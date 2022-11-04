public void nextPermutation(int[] nums) {
        int j=-1;
        int k=0;
        int left;
        int right;
        int temp;
        for(int i=nums.length-2;i>=0;i--){ //从后向前找到不是递减的那个数
            if(nums[i]<nums[i+1]){
                j=i;
                break;
            }
        }
        if(j>-1){ 
        for(int i=nums.length-1;i>j;i--){ //从后往前找第一个比那个数大的数
            if(nums[i]>nums[j]){
                k=i;
                break;
            }
        }
        temp=nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
        right=nums.length-1;
        left=j+1;}
        else{ //整个数都是递减的
            right=nums.length-1;
            left=0;
        }
        while(right>left){ //将那段子序列反转，成为递增的序列
            temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right--;
            left++;
        }
    }
