class Solution {
    public int mirrorDistance(int n) {
        int rev = revForMe(n);
        return Math.abs(n - rev);
    }

    public int revForMe(int n){
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n /= 10;
            sum = sum * 10 + rem;
        }

        return sum;
    }   
}