class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("*")){
                    int right = stack.pop(); 
                    int left = stack.pop();   
                    int val = left * right; 
                    stack.push(val);
            }else if(ch.equals("/")){
                    int right = stack.pop(); 
                    int left = stack.pop();   
                    int val = left / right; 
                    stack.push(val);
            }
            else if(ch.equals("+")){
                    int right = stack.pop(); 
                    int left = stack.pop();   
                    int val = left + right; 
                    stack.push(val);
            }else if(ch.equals("-")){
                    int right = stack.pop(); 
                    int left = stack.pop();   
                    int val = left - right; 
                    stack.push(val);
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}