class Solution {
    public int maxSubArray(int[] nums) {
    //    if(nums.length < 1) return nums[0];
       int largestSum = Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i<nums.length;i++){
        sum += nums[i];
        if(sum > largestSum){
            largestSum = sum;
        }
        if(sum < 0){
            sum = 0;
        }
       }

        return largestSum;
       
    }
}