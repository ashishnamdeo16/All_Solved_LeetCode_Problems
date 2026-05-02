class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();       
  }
}