class Solution {
     public  List<String> result=new ArrayList<>();
    public  List<String> restoreIpAddresses(String s) {
        StringBuffer str=new StringBuffer(s);
        backtracking(str,0,0);
        return result;
    }
    public  void backtracking(StringBuffer s,int startindex,int dot_number){
        if(dot_number==3){  //当有三个.，剩下的是最后一段
            if(is_valid(s,startindex,s.length()-1)){
                String r=s.toString();
                result.add(r);  //最后一段满足条件，加入答案
            }
            return;
        }
        for(int i=startindex;i<s.length();i++){
            if(is_valid(s,startindex,i)){
                s.insert(i+1,".");
                dot_number+=1;
                backtracking(s,i+2,dot_number); //回溯，注意i+2,因为有.
                dot_number-=1;
                s.deleteCharAt(i+1);
            }
            else{
                break;
            }

        }

    }
    public  boolean is_valid(StringBuffer s,int left,int right){
        if(left>right){ 
            return false;
        }
        if(s.charAt(left)=='0' && left!=right){ //如果首位是0且不是0 单个整数
            return false;
        }
        String temp=s.substring(left,right+1);
        if(temp.length()>=4){ //如果是四位数，防止转Integer报错
            return false;
        }
        int t=Integer.parseInt(temp); //转为整数类型
        return t>=0 && t<=255; //在区间范围内
    }
}
