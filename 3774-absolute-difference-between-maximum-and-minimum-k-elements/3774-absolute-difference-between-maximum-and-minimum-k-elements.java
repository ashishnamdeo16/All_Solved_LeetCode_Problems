class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int smallestSum = 0;
        int largestSum = 0;

        int l = nums.length - 1;
        for(int i=0;i<k;i++){
            smallestSum += nums[i];
            largestSum += nums[l--];
        }

       return Math.abs(largestSum - smallestSum);
    }
}