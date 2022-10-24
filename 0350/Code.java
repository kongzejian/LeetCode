class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> list=new ArrayList<>();//由于数组大小不可变，而且数组大小未知，先用List存放答案
        int p1=0;
        int p2=0; //两个指针
        Arrays.sort(nums1);
        Arrays.sort(nums2);//排序
        while(p1<nums1.length&&p2<nums2.length){
            if(nums1[p1]==nums2[p2]){ //元素相等，添加入List中
                list.add(nums1[p1]);
                p1++;
                p2++;

            }
            else if(nums1[p1]>nums2[p2]){ 
                p2++;
            }
            else{
                p1++;
            }
        }

        int[] result=new int[list.size()]; //创建数组并填充元素
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;

    }
}
