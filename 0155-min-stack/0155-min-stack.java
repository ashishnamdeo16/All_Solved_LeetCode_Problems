class MinStack {
    Stack<Integer> arr;
    Stack<Integer> minArr;
    
    public MinStack() {
       arr = new Stack<>();
       minArr = new Stack<>();
    }
    
    public void push(int val) {
        arr.push(val);
        if(!minArr.isEmpty() && minArr.peek() >= val){
            minArr.push(val);
        }else if(minArr.isEmpty()){
            minArr.push(val);
        }

    }
    
    public void pop() {
       int val = arr.pop();
       if(val == minArr.peek()){
          minArr.pop();
       }
    }
    
    
    public int top() {
        return arr.peek();
    }

    public int getMin() {
         if(!arr.isEmpty()){
             return minArr.peek();
         }
       return -1;
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