class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,1,0);
        return result;
    }
    public void backtracking(int k,int targetsum,int startindex,int sum){
        if(sum>targetsum){
            return;
        }
        if(path.size()==k){
            if(sum==targetsum){
                result.add(new ArrayList<Integer>(path));
                return;
            }
        }
        for(int i=startindex;i<targetsum&&i<=(9-(k-path.size())+1);i++){
            sum+=i;
            path.add(i);
            backtracking(k,targetsum,i+1,sum);
            sum-=i;
            Integer remove_item=Integer.valueOf(i);
            path.remove(remove_item);
        }
        }
        }

