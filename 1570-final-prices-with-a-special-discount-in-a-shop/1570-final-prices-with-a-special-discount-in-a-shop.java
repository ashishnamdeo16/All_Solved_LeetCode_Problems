class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        int n = prices.length - 1; 
        for(int i=n;i>=0;i--){
            ans[i] = prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(j>i && prices[j] <= prices[i]){
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return ans;
    }
}