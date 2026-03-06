class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String finalAns = "";
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            finalAns = stack.pop() + finalAns;
        }
        return finalAns;       
  }
}