class Solution {
    public int longestMountain(int[] arr) {
        int[] increase=new int[arr.length]; //存储当前元素左边连续递增的元素个数
        int[] decrease=new int[arr.length]; //存储当前元素右边连续递减的元素个数
        increase[0]=1;
        decrease[arr.length-1]=1;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > arr[i - 1]) {
                increase[i] = increase[i - 1] + 1;
            }
            else {
            increase[i]=1;}
        }
        for(int i=arr.length-2;i>=0;i--){
                if(arr[i]>arr[i+1]){
                decrease[i]=decrease[i+1]+1;}
                else {
                decrease[i]=1;}
            }
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            if(increase[i]>1 &&decrease[i]>1){ //一定要大于1（不算本身）
            cur=increase[i]+decrease[i]-1;}
            max=Math.max(cur,max);
        }
        return max;
    }
}
