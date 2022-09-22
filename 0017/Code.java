class Solution {
    public List<String> result = new ArrayList<>();
    public static String path="";
    public String[] map={"","","abc","def","ghi","jkl","nmo","pqrs","tuv","wxyz"}; //建立数组 索引对应数字，值对应字母
    public int index;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return result;
        }
        index=0;
        backtracking(digits.length(),index,digits);
        return result;
    }
    public void backtracking(int length,int startindex,String digits) {
        if (path.length() == length) {
            String temp=path;
            result.add(temp);
            return;
        }
        String number=digits.substring(index,index+1);
        String symbol = map[Integer.parseInt(number)]; //symbol 为 abc
        for (int i = 0; i < symbol.length(); i++) {
            path += symbol.substring(i, i + 1);
            index+=1;
            backtracking(length,index+1,digits);
            index-=1;                          //回溯
            path=path.substring(0,path.length()-1); //去掉path中最后一个字母
        }
    }
}
