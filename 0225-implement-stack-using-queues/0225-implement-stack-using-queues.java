class MyStack {
    ArrayDeque<Integer> stack;

    public MyStack() {
       this.stack = new  ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        stack.addLast(x);
    }
    
    public int pop() {
        return stack.removeLast();
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
