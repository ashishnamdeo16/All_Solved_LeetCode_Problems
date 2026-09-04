class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        int totalSum = nums[0];
         int bestMin = nums[0];
        int bestMax = nums[0];

        for(int i=1;i<nums.length;i++){
            totalSum += nums[i];

            bestMin = Math.min(nums[i],bestMin + nums[i]);

            min = Math.min(bestMin,min);

            bestMax = Math.max(nums[i],nums[i]+bestMax);

            max = Math.max(bestMax,max);
        }

        if(max < 0){
            return max;
        }

        res =  Math.max(max,totalSum - min);

        return res;
    }
}