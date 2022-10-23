class Solution {
    public String getHint(String secret, String guess) {
        int A=0;
        int B=0;
        HashSet<Integer> map=new HashSet<>(); //存放数字位置都相同的 secret的索引
        HashMap<Character,Integer> set=new HashMap(); //存放guess当中，除了数字位置都相同的，数字及其个数
        for(int i=0;i<secret.length();i++) {
            if (secret.charAt(i) == guess.charAt(i)) { //数字位置都相同，A加一
                A++;
                map.add(i);
            } else { //数字位置不相同，如果set之前没有这个数字，数字-1；如果有数字-数量+1
               if(set.containsKey(guess.charAt(i))){
                   set.replace(guess.charAt(i),set.get(guess.charAt(i))+1);
               }
               else{
                   set.put(guess.charAt(i),1);
               }
            }
        }

        for(int i=0;i<secret.length();i++){ //遍历secret当中数字位置不相同的数字
           if(!map.contains(i)&&set.containsKey(secret.charAt(i))&&set.get(secret.charAt(i))!=0){ //如果set当中有这个数字且数量不为0，B++
               B++;
               set.replace(secret.charAt(i),set.get(secret.charAt(i))-1);
           }
        }

       String result="";
       result+=String.valueOf(A);
       result+="A";
       result+=String.valueOf(B);
       result+="B";
       return result;
    }
}
