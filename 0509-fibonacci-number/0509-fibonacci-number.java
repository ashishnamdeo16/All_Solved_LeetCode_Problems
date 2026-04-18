class Solution {
   
    public int fib(int n) {
       int[] dp = new int[n+1];
       Arrays.fill(dp,-1);
       return fibDp(n,dp);
    }

    public int fibDp(int n,int[] dp){
      if(dp[n] != -1) return dp[n];
      if(n < 2 ) return n;
      dp[n] = fib(n-1) + fib(n-2);
      return dp[n];
    }
}