class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res = Math.abs(nums[0]);
        int maxSum = nums[0];
        int minSum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            maxSum = Math.max(nums[i],nums[i] + maxSum);
            minSum = Math.min(nums[i],nums[i] + minSum);
            res = Math.max(Math.max(Math.abs(maxSum),Math.abs(minSum)),res);
        }

        return res;
    }
}