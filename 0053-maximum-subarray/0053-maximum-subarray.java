class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int bestEnding = 0;

        for(int i=0;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = nums[i] + bestEnding;
            bestEnding = Math.max(v1,v2);
            max = Math.max(bestEnding,max);
        }

        return max;
    }
}