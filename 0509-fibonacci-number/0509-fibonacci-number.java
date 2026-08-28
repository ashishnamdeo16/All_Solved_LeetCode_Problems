class Solution {
   
    public int fib(int n) {
        if(n == 1 || n == 0) return n;
        return fib(n - 1) + fib(n-2);
    }

    // public int fibDp(int n,int[] dp){
    //   if(n < 2 ) return n;
    //   if(dp[n] != -1) return dp[n];
    //   dp[n] = fibDp(n-1,dp) + fibDp(n-2,dp);
    //   return dp[n];
    // }
}