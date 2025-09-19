class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = temperatures.length - 1;i>=0;i--){
            if(stack.isEmpty()){
                ans[i] = 0;
            }else if( temperatures[i] >= stack.peek().temp){
                while(!stack.isEmpty() && temperatures[i] >= stack.peek().temp){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i] = 0;
                }else{
                    ans[i] = stack.peek().index - i;
                }
            }else if(!stack.isEmpty() && temperatures[i] < stack.peek().temp){
                ans[i] = stack.peek().index - i;
            }
            stack.push(new Pair(temperatures[i],i));
        }
        return ans;
    }
    public class Pair{
        int temp;
        int index;
        public Pair(int temp, int index){
            this.temp = temp; 
            this.index = index;
        }
    }
}