class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hash=new HashMap<>();
        if(s.length()!=t.length()){
            return false;                  //确保长度相等
        }
        for(int i=0;i<s.length();i++){
            if(!hash.containsKey(s.charAt(i))){
                if(hash.containsValue(t.charAt(i))){ //处理 b->s  d->s的情况，尽管键不同，但是值已经出现过
                    return false;
                }
                hash.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(hash.get(s.charAt(i))!=t.charAt(i)){ //相同的键，比较对应的值是否相同
                    return false;
                }
            }
        }
        return true;
    }
}
