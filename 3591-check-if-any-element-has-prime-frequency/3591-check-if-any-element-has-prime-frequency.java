class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] arr = new int[101];
        Arrays.fill(arr,0);
      
        for(int i : nums){
            arr[i]++;
        }

        for(int x : arr){
            if(x != 0 && isPrime(x)) return true;
        }
        return false;
    }

    public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
}