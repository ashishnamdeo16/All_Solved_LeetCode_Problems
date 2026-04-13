class Solution {
    public int maxDepth(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                stack.pop();
            }
            res = Math.max(res,stack.size());
        }
        return res;
    }
}