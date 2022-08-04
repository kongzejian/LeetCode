class Solution {
    public int romanToInt(String s) {
        int result=0;
        int i=0;
        int current;
        int next;
        while(i<s.length()){
            current=number(s.charAt(i));
            if(i<s.length()-1) { //考虑特殊情况 小的在大的后面的情况
                next = number(s.charAt(i + 1));
                if (current == 1 && (next == 5 || next == 10)) {
                    result += next - current;
                    i += 2;
                    continue;
                }
                if (current == 10 && (next == 50 || next == 100)) {
                    result += next - current;
                    i += 2;
                    continue;
                }
                if (current == 100 && (next == 500 || next == 1000)) {
                    result += next - current;
                    i += 2;
                    continue;
                }
            }
            result+=current;
            i++;

        }
        return result;
    }
    public static int number(char s){ //根据字母返回数字的函数
        if(s=='I'){
            return 1;
        }
        else if(s=='V'){
            return 5;
        }
        else if(s=='X'){
            return 10;
        }
        else if(s=='L'){
            return 50;
        }
        else if(s=='C'){
            return 100;
        }
        else if(s=='D'){
            return 500;
        }
        else if(s=='M') {
            return 1000;
        }
        return 0;
    }
}
