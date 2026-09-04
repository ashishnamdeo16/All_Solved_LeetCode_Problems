class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int res = Math.abs(nums[0]);
       int min = nums[0];
       int max = nums[0];

       for(int i = 1; i < nums.length; i++){
            min = Math.min(nums[i],nums[i] + min);
            max = Math.max(nums[i],nums[i] + max);
            res = Math.max(res, Math.max(Math.abs(min),Math.abs(max)));
       }

       return res; 
    }
}