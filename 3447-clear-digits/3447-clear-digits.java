class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()){
            if(Character.isDigit(a)){
                stack.pop();
            }else{
                stack.push(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) sb.append(c);
        return sb.toString();
    }
}