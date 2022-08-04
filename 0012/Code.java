class Solution {
    public String intToRoman(int num) { 
        int m=num/1000;
        if(m!=0){
            num-=m*1000;
        }
        int cm=num/900;
        if(cm!=0){
            num-=cm*900;
        }
        int d=num/500;
        if(d!=0){
            num-=d*500;
        }
        int cd=num/400;
        if(cd!=0){
            num-=cd*400;
        }

        int c=num/100;
        if(c!=0){
            num-=c*100;
        }
        int xc=num/90;
        if(xc!=0){
            num-=xc*90;
        }
        int l=num/50;
        if(l!=0){
            num-=l*50;
        }
        int xl=num/40;
        if(xl!=0){
            num-=xl*40;
        }

        int x=num/10;
        if(x!=0){
            num-=x*10;
        }
        int ix=num/9;
        if(ix!=0){
            num-=ix*9;
        }
        int v=num/5;
        if(v!=0){
            num-=v*5;
        }
        int iv=num/4;
        if(iv!=0){
            num-=iv*4;
        }
        int i=num/1;
        if(i!=0){
            num-=i*50;
        }
        String result="";
        for(int index=0;index<m;index++){
            result+="M";
        }
        for(int index=0;index<cm;index++){
            result+="CM";
        }
        for(int index=0;index<d;index++){
            result+="D";
        }
        for(int index=0;index<cd;index++){
            result+="CD";
        }
        for(int index=0;index<c;index++){
            result+="C";
        }
        for(int index=0;index<xc;index++){
            result+="XC";
        }
        for(int index=0;index<l;index++){
            result+="L";
        }
        for(int index=0;index<xl;index++){
            result+="XL";
        }
        for(int index=0;index<x;index++){
            result+="X";
        }
        for(int index=0;index<ix;index++){
            result+="IX";
        }
        for(int index=0;index<v;index++){
            result+="V";
        }
        for(int index=0;index<iv;index++){
            result+="IV";
        }
        for(int index=0;index<i;index++){
            result+="I";
        }
        return result;
    }
}
