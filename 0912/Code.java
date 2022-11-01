  //快速排序，要背出来，面试要考
public static int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    public static void quicksort(int[] nums,int begin,int end){
        if(begin>=end){ //只有一个元素或者没有元素，返回
            return;
        }
        int left=begin;
        int right=end;
        while(left<right){ 
            while(nums[right]>=nums[begin]&&left<right){ //先右后左，注意边界
                right--;
            }
            while(nums[left]<=nums[begin]&&left<right){
                left++;
            }
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

        }
        int t=nums[begin];
        nums[begin]=nums[left];
        nums[left]=t;
        quicksort(nums,begin,left-1);
        quicksort(nums,left+1,end);

    }
