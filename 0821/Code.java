class Solution {
    public int[] shortestToChar(String s, char c) {
         int[] answer=new int[s.length()];
        int index=0;
        while(s.charAt(index)!=c){
            index+=1;
        }                            //找到第一个目标字符
        for(int i=0;i<=index;i++){
            answer[i]=Math.abs(i-index);
        }                              //第一个目标字符前的元素距离赋值
        int pre=-1;
        while(index<s.length()-1){
            pre=index;
            index+=1;
            while(s.charAt(index)!=c){  //找到后续的目标字符
                index+=1;
                if(index>s.length()-1){  //如果超出边界，说明只有一个目标字符
                    int d=1;
                    for(int i=pre+1;i<s.length();i++){
                        answer[i]=d++; //计算与唯一个目标字符的距离
                    }
                    return answer;
                }
            }
            for(int i=pre+1;i<=index;i++){   //找到当前的目标字符，与前一个目标字符，根据索引，前半段与前一个目标字符计算距离，后半段与后一个目标字符计算距离
                if(i<=(index-pre)/2+pre){
                    answer[i]=Math.abs(i-pre);
                }
                else {
                    answer[i]=Math.abs(i-index);
                }
            }

        }
    return  answer;
    }
}
