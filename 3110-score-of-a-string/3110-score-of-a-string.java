class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        int r = 1;
        while(r < s.length()){
            int ch = s.charAt(r);
            int chPrv = s.charAt(r-1);
            sum += Math.abs(ch - chPrv);
            r++;
        }
        return sum;
    }
}