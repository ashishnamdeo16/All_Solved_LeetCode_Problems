class Solution {
    public int calPoints(String[] operations) {
       int tsum = 0;

        Stack<Integer> stack = new Stack<>();

        for(String s : operations){
            if("C".equals(s)){
                stack.pop();
            }else if("D".equals(s)){
                int x = stack.peek() * 2;
                stack.push(x);
            }else if("+".equals(s)){
                int pop = stack.pop();
                int peek = stack.peek();
                int sum = pop + peek;
                stack.push(pop);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        while(!stack.isEmpty()){
            tsum += stack.pop();
        }

        return tsum;
    }
}

// Begining - []
// 