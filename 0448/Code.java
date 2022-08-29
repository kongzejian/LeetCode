class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        int[] t=new int[nums.length];
        for(int i=0;i<t.length;i++){
            t[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            t[nums[i]-1]=-1;
        }
        for(int i=0;i<t.length;i++){
            if(t[i]==0){
                result.add(i+1);
            }
        }
        return result;

        
    }
}
