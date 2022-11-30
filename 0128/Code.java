class Solution {
    public String convertToTitle(int columnNumber) {
    Character[] table={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    int remainder;
    StringBuffer result=new StringBuffer();
    while(columnNumber>0){
    columnNumber--; //这一操作是关键
    remainder=columnNumber%26;
    columnNumber=columnNumber/26;
    result.insert(0,table[remainder]);
    }
    return result.toString();
    }
}
