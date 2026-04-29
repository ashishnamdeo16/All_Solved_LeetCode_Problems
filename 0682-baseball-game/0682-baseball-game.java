class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s : operations){
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int x = stack.peek();
                stack.push(x * 2);
            }else if(s.equals("+")){
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                stack.push(x + y);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        int sum =0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        return sum;
    }
}