class Solution {
    public int[] twoSum(int[] numbers, int target) {
          HashMap<Integer, Integer> h = new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(!h.containsKey(target-numbers[i])){
                h.put(numbers[i],i );
            }
            else {
                int index2=i+1;
                int index1=h.get(target-numbers[i])+1;
                result = new int[]{index1,index2};
                break;
            }
        }
        return result;
    }
}
