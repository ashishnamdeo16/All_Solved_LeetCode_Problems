class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(!stack.isEmpty() && x == stack.peek()){
                stack.pop();
            }else{
                stack.push(x);
            }
        }

        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }

        return sb.toString();
   }
}