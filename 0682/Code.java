class Solution {
    public int calPoints(String[] ops) {
         Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ops.length;i++)
        {
            if(isInteger(ops[i]))
            {
                stack.push(Integer.parseInt(ops[i]));
            }
            else if (ops[i].equals("+"))
            {
                Integer upper=stack.pop();
                Integer bottom=stack.pop();
                Integer new_number=bottom+upper;
                stack.push(bottom);
                stack.push(upper);
                stack.push(new_number);

            }
            else if (ops[i].equals("C"))
            {
                stack.pop();
            } else if (ops[i].equals("D"))
            {
                stack.push(2*stack.peek());
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;

    }
    public  boolean isInteger(String value){ //判断字符串的内容是否为整数
        try{
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e){
            return false;
        }

        }

}
