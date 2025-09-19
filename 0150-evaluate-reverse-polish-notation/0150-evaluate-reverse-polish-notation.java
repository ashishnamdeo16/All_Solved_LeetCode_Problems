class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int val = stack.pop() + stack.pop();
                stack.push(val);
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                int val = b - a;
                stack.push(val);
            }else if(s.equals("*")){
                int val = stack.pop() * stack.pop();
                 stack.push(val);
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int val = b/a;
                 stack.push(val);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}