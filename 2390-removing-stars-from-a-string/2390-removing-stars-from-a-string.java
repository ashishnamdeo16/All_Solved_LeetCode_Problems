class Solution {
    public String removeStars(String s) { 
        Stack<Character> stack = new Stack<>(); 
        int l=0;
        while(l<s.length()){
            char ch = s.charAt(l);
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        
            l++;  
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}