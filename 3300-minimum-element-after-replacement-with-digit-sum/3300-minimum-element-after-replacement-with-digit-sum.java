class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            int x = findSum(nums[i]);
            min = Math.min(min,x);
        }

        return min;
    }
    public int findSum(int x){
        int sum =0;
        while(x > 0){
            int rem = x % 10;
            sum += rem;
            x /= 10;
        }

        return sum;
    }
}