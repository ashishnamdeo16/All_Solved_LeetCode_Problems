class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int total = numBottles;
        while(empty >= numExchange){
            int newBottles = empty/numExchange;
            total += newBottles;
            empty = newBottles + (empty%numExchange);
        }
        return total;
    }
}