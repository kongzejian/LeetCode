//只击败了5%的垃圾方法
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window_length=s1.length();
        int start=0;
        while(start+window_length-1<s2.length()){
            if(check(s1,s2.substring(start,start+window_length))){
                return true;
            }
            start++;
        }
        return false;
    }
     public boolean check(String p1,String p2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<p1.length();i++){
            if(!map.containsKey(p1.charAt(i))){
                map.put(p1.charAt(i),1);
            }
            else{
                map.replace(p1.charAt(i),map.get(p1.charAt(i))+1);
            }
        }
        for(int i=0;i<p2.length();i++){
            if(!map.containsKey(p2.charAt(i))){
                return false;
            }
            else{
                map.replace(p2.charAt(i),map.get(p2.charAt(i))-1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;

    }
}
