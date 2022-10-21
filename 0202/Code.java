class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1){
            int next_number=0;
        while(n>0){
            next_number+=(n%10)*(n%10);
            n/=10;
        }                                  //得到下一个树的值
        if(set.contains(next_number)){  //判断是否循环
            return false;
        }
        set.add(next_number); //不循环，就加入set中
        n=next_number;
        }
        return true;
    }
}
