class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int res = 0;
        for(int x : gain){
            sum += x;
            res = Math.max(sum,res);
        }
        return res;
    }
}