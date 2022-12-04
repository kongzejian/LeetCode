    public static boolean result=false;
    public static int count=1;
    public static boolean isAdditiveNumber(String num) {
    backtracking(count,0,0,0,num);
    return result;
    }
    public static void backtracking(int c,long p,long pp,int start,String num){
    if(start==num.length()&&count>=4){ //到这一步，count++过后，如果大于等于4，说明原来数目大于等于3
        result=true; //最终结果为true
        return;
    }
    long cur; //用int会溢出
    String s;
    for(int i=start;i<num.length();i++){
        s=num.substring(start,i+1);
        if(s.length()>num.length()/2){ //long 也会溢出，加这个判断，如果大于s的总长的一半，那肯定不会有比他更大的数了，肯定返回
            return;
        }
        cur=Long.parseLong(s);
        if(cur<10&&num.substring(start,i+1).length()>1){ //这个地方是保留0，但是剔除像01 02 03这种
            break;
        }
        if(count==1){
            count++;
            backtracking(count,0,cur,i+1,num); //第一个累加数，cur作为前前一个传入
            count--;//回溯
            if(result){//如果result为true,就不用继续了，直接return
                return;
            }
        }
        else if(count==2){
            count++;
            backtracking(count,cur,pp,i+1,num); //第二个累加数，cur作为前一个，这里pp就是第一个累加数
            count--;//回溯
            if(result){
                return;
            }
        }
        else{
            if(p+pp==cur){ //判定有效
                count++;
                backtracking(count,cur,p,i+1,num);
                count--; //回溯
                if(result){
                    return;
                }
            }
            else if(p+pp<cur){
                break;
            }
        }
    }
