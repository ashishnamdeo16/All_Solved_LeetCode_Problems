class StockSpanner {
    Stack<int[]> stack;
    
    public StockSpanner() {
        this.stack = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        if(!stack.isEmpty()){
        for(int[] arr : stack){
            if(arr[0] < price){
                count++;
        }
        }
        stack.push(new int[]{price,count});    
       }else{
        stack.push(new int[]{price,count});
       }
       return count; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */