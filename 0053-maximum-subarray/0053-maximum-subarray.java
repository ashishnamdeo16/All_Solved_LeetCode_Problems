class Solution {
    public int maxSubArray(int[] nums) {
    if(nums.length < 1) return nums[0];
      int high = 0;
      int sum = 0;
      int largestSum = Integer.MIN_VALUE;
      while(high < nums.length){
        sum += nums[high];
         if(sum > largestSum){
            largestSum = sum;
         }
         if(sum < 0){
            sum = 0;
         }
        high++;
      }
      return largestSum;
    }
}