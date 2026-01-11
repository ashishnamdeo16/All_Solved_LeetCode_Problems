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
        int size = stack.size();
        for(int i=0;i<size;i++){
            sb.append(stack.pop());
        }
        sb.reverse();
        String newS = sb.toString();
        return newS;
    }
}