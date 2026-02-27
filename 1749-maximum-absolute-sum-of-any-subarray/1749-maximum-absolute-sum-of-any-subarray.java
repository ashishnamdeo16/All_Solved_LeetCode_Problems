class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minBestEnding = nums[0];
        int maxBestEnding = nums[0];
        int res = Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            minBestEnding = Math.min(nums[i],minBestEnding+nums[i]);
            maxBestEnding = Math.max(nums[i],maxBestEnding+nums[i]);
            res = Math.max(res,Math.max(Math.abs(minBestEnding),Math.abs(maxBestEnding)));
        }
        return res;
    }
}