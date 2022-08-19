class Solution {
    public boolean isValid(String s) {
          Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            String temp=s.charAt(i)+"";
            if(temp.equals("(") || temp.equals("[") || temp.equals("{")){
                stack.push(temp);}
            if(temp.equals(")"))
            {
                if(!stack.isEmpty()){
                    String r=stack.pop();
                    if(r.equals("(")){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }


            }
            if(temp.equals("]"))
            {
                if(!stack.isEmpty()){
                    String r=stack.pop();
                    if(r.equals("[")){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }


            }
            if(temp.equals("}"))
            {
                if(!stack.isEmpty()){
                    String r=stack.pop();
                    if(r.equals("{")){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }


            }

        }
        if(stack.isEmpty()){
        return true;}
        else {
            return false;
        }
    }
}
