class Solution {
   
    public int fib(int n) {
       if(n < 2) return n;  
    //    int[] dp = new int[n+1];
    //    Arrays.fill(dp,-1);
    //    dp[0] = 0;
    //    dp[1] = 1;
    int prev = 0;
    int prev2 = 1;

       for(int i=2;i<=n+1;i++){
         int curr = prev + prev2;
         prev = prev2;
         prev2 = curr;
       }

       return prev;
    }

    // public int fibDp(int n,int[] dp){
    //   if(n < 2 ) return n;
    //   if(dp[n] != -1) return dp[n];
    //   dp[n] = fibDp(n-1,dp) + fibDp(n-2,dp);
    //   return dp[n];
    // }
}