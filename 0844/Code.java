class Solution {
    public boolean backspaceCompare(String s, String t) {
                  Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String cur = s.charAt(i) + "";
            if (cur.equals("#") && !stack1.isEmpty()) {
                stack1.pop();                           //如果是#号，且栈不为空，弹出一个元素
            } else if (!cur.equals("#")) {
                stack1.push(cur);
            }
        }
            for (int i = 0; i < t.length(); i++) {
                String cur = t.charAt(i) + "";
                if (cur.equals("#") && !stack2.isEmpty()) {
                    stack2.pop();
                } else if (!cur.equals("#")) {
                    stack2.push(cur);
                }                       
            }

            while (!stack1.isEmpty() && !stack2.isEmpty()) {
                if (!stack1.pop().equals(stack2.pop())) {
                    return false;                              //比较
                }
            }
            return stack1.isEmpty() && stack2.isEmpty();
    }
}
