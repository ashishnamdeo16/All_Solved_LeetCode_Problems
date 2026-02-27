class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int bestTillNow = 0;
        for(int i=0;i<nums.length;i++){
            int option1 = nums[i];
            int option2 = nums[i] + bestTillNow;
            bestTillNow = Math.max(option2,option1);
            ans = Math.max(bestTillNow,ans);
        }
        return ans;
    }
}