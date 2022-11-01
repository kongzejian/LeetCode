 public static int findUnsortedSubarray(int[] nums) {
            int[] sorted_num=new int[nums.length];
            System.arraycopy(nums,0,sorted_num,0,nums.length);
            Arrays.sort(sorted_num); //先排序
            int begin=0;
            int end=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=sorted_num[i]){ //从左往右找到第一个不一样的元素，索引为begin
                    begin=i;
                    break;
                }
            }
            for(int i=nums.length-1;i>=0;i--){ //从右往左找到第一个不一样的元素，索引为end
                if(nums[i]!=sorted_num[i]){
                    end=i;
                    break;
                }
            }
            return end-begin+1;
        }
