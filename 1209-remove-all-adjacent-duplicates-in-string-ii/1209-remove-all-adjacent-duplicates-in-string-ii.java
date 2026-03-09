class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i = 0; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(new Pair(ch,1));
                continue;
            }
            if(!stack.isEmpty() && stack.peek().ch == ch){
                if(stack.peek().count == k - 1){
                    stack.pop();
                    continue;
                }else{
                    Pair temp = stack.pop();
                    stack.add(new Pair(temp.ch,temp.count + 1));   
                    continue;
                }    
            }
            if(!stack.isEmpty() && stack.peek().ch != ch){
                stack.push(new Pair(ch,1));
                continue;
            }
        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            Pair temp = stack.pop();
            for (int i = 0; i < temp.count; i++) {
                res.append(temp.ch);
            }
        }

        return res.reverse().toString();
    }
    public class Pair{
        char ch;
        int count;
        public Pair(char ch,int count){
            this.ch = ch;
            this.count = count;
        }
    }
}