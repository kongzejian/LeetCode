 public int findKthPositive(int[] arr, int k) {
        int left=-1;
        int right= arr.length;
        int mid;
        while(left+1!=right){
            mid=left+(right-left)/2;
            if(arr[mid]-(mid+1)<k){ //分为两组，左边那组为小于缺失k的,右边那组是缺失大于等于K的,最后left指向最右边缺失小于k的那个数
                left=mid;
            }
            else{
                right=mid;
            }
        }
        if(left==-1){ //如果left为-1，说明数组第一个缺失的都大于等于k 比如3 4 5 6,找缺失为2，直接返回2
            return k;
        }
        else{
        return k+left+1;} //2 3 4 7 11 ,k=5,left指向7，缺失3，差2,7+2=9，arr[left]+(k-(arr[left]-(left+1)))=k+left+1
    }
