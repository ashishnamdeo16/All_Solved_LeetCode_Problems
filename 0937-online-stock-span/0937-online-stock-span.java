class StockSpanner {
       Stack<Pair> stack;

    public StockSpanner() {
       stack = new Stack<>();
    }
    
    public int next(int price) {
        int count =1;
        while(!stack.isEmpty() && stack.peek().num1 <= price ){
            count += stack.pop().num2;
        }
        stack.push(new Pair(price,count));
        return count;
    }

    public class Pair{
        int num1;
        int num2;
        public Pair(int num1,int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */