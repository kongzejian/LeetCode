class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }

         public void backtracking(int n,int k,int startindex){
            if(path.size()==k){
                result.add(new ArrayList<>(path));
            }
            for(int i=startindex;i<=n;i++){
                path.add(i);
                backtracking(n,k,i+1);//递归 
                Integer remove_value=Integer.valueOf(i); //将int 类型转化为object类，因为path.remove()如果传入int会按索引删除
                path.remove(remove_value);//回溯
            }
        }
}
