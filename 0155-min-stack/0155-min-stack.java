class MinStack {
    Stack<Long> stack;
    long minElement;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
         long v = val;
         if(stack.isEmpty()){
            stack.push(v);
            minElement = v;
            return;
        }
        if(v >= minElement){
            stack.push(v);
        }else if(v < minElement){
            stack.push(2*v - minElement);
            minElement = v;
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.peek() >= minElement){
            stack.pop();
        }else if(stack.peek() < minElement){
            minElement = 2*minElement - stack.peek();
            stack.pop();
        }
    }
    
    
    public int top() {
    if (stack.isEmpty()) return -1;
    long top = stack.peek();
    if (stack.peek() >= minElement) {
        return (int) top;
    } else {
        return (int) minElement;
    }
    }

    public int getMin() {
       if(stack.isEmpty()) return -1;
        return (int) minElement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */