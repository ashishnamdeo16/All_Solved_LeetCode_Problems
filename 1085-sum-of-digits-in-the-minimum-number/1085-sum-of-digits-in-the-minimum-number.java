class Solution {
    public int sumOfDigits(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min,x);
        }

        int sum = 0;

        while(min > 0){
            int rem = min%10;
            sum += rem;
            min /= 10;
        }

        if(sum%2 == 0){
           return 1;
        }

        return 0;
    }
}