class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}