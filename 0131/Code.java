class Solution {
    public List<List<String>> result = new ArrayList<>();
    public List<String> path=new ArrayList<>();
    public List<List<String>> partition(String s) {
         bakctracking(s,0);
        return result;
    }
    public void bakctracking(String str,int start_index){
         if(start_index>str.length()-1){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start_index;i<str.length();i++){
            if(is_palindromic(str,start_index,i)){
                path.add(str.substring(start_index,i+1));
            }
            else {
                continue;
            }
            bakctracking(str,i+1); //回溯
            path.remove(path.size()-1);
        }

    }
    public boolean is_palindromic(String s,int left,int right){ //判断字符串的一部分是不是回文数
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
