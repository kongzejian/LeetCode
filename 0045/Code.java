 public int jump(int[] nums) {
     if(nums.length==1){
            return 0;
        }
    int curcover=nums[0];
    int nextcover=0;
    int precover=0;
    int count=0;//到终点的步数
    int t=0;
    while (curcover<nums.length-1) {
        for (int i = precover+1; i <= curcover; i++) { //i从上一步的最大范围的下一个开始遍历
            t = Math.max(curcover, i + nums[i]);
            nextcover=Math.max(t,nextcover); //nextcover是走完下一步的最大覆盖范围
        }
        if (nextcover > curcover) { //如果下一步最大范围大于当前的，说明需要走下一步
            count++;
        }
        precover=curcover;
        curcover=nextcover;
    }
    return ++count;
    }
