//法1，哈希表记录字母-位置
class Solution {
    public int firstUniqChar(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            else{
                map.replace(s.charAt(i),Integer.MAX_VALUE); //如果有重复的，索引设为最大值
            }
        }
        int result=Integer.MAX_VALUE;
       for(int i=0;i<s.length();i++){
       result=Math.min(result,map.get(s.charAt(i))); //遍历数组，获得最小索引
       }
       return result==Integer.MAX_VALUE?-1:result;
    }
}
//方法二，哈希表记录 字母-出现次数
class Solution {
    public int firstUniqChar(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
       for(int i=0;i<s.length();i++){
          if(map.get(s.charAt(i))==1){
              return i;
          }
       }
       return -1;
    }
}
