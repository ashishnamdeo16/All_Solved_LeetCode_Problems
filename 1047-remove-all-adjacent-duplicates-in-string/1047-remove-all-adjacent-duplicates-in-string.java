class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        // Stack<Character> stack = new Stack<>();

        // for(char x : s.toCharArray()){
        //     if(!stack.isEmpty() && x == stack.peek()){
        //         stack.pop();
        //     }else{
        //         stack.push(x);
        //     }
        // }

        // while(!stack.isEmpty()){
        //     sb.insert(0,stack.pop());
        // }

 

        for(char x : s.toCharArray()){
            if(sb.length() > 0 && x == sb.charAt(sb.length() - 1)){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(x);
            }
        }

           return sb.toString();

   }
}