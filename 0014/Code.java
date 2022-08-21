class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int index=0;
        String result="";
        while(true){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].length()-1<index|| strs[i+1].length()-1<index ||strs[i].length()==0 ||strs[i+1].length()==0)
                {
                    return result;
                }
                else if (strs[i].charAt(index)!=(strs[i+1].charAt(index)))
                {
                    return result;
                }
            }
            result+=strs[0].charAt(index);
            index+=1;
        }
    }
}
