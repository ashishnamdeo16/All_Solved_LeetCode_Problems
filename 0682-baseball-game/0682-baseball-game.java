class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(2* stack.peek());
            }else if(op.equals("+")){
                int last = stack.pop();
                int newTop = last + stack.peek();
                stack.push(last);  
                stack.push(newTop);  
            }else {
                int num = Integer.parseInt(op);
                stack.push(num);
            }
        }
        int sum = 0;
        for(int i=0;i<stack.size();i++){
            sum += stack.get(i);
        }
        return sum;
    }
}