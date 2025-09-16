class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        int n = prices.length - 1; 
        Stack<Integer> stack = new Stack<>();

        for(int i=n;i>=0;i--){
              while(!stack.isEmpty() && stack.peek() > prices[i]){
                stack.pop();
              }
              if(stack.isEmpty()){
                 ans[i] = prices[i];
              }else{
                 ans[i] = prices[i] - stack.peek();;
              }
            stack.push(prices[i]);
        }


        //Brute Force
        // for(int i=n;i>=0;i--){
        //     ans[i] = prices[i];
        //     for(int j=i+1;j<prices.length;j++){
        //         if(j>i && prices[j] <= prices[i]){
        //             ans[i] = prices[i] - prices[j];
        //             break;
        //         }
        //     }
        // }
        return ans;
    }
}