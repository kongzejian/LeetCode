class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(!h.containsKey(target-numbers[i])){
                h.put(numbers[i],i );
            }
            else {
                return new int[]{i+1,h.get(target-numbers[i])+1};
            }
        }
        return new int[]{-1,-1};
    }
}
