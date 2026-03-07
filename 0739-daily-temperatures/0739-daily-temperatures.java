class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        ans[n-1] = 0;
        stack.push(new Pair(temperatures[n-1],n-1));
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek().temp <= temperatures[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stack.peek().index - i;
            }
            stack.push(new Pair(temperatures[i],i));
        }
        return ans;
    }
    public class Pair{
        int index ;
        int temp;
        public Pair(int temp,int index){
            this.temp = temp;
            this.index = index;
        }
    }
}