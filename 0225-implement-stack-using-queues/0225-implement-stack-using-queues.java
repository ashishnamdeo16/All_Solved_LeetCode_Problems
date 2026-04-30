class MyStack {
    ArrayDeque<Integer> stack;

    public MyStack() {
       this.stack = new  ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        stack.offer(x);
    }
    
    public int pop() {
        if (!stack.isEmpty()) {
            return stack.removeLast();
        }
        return -1;
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
