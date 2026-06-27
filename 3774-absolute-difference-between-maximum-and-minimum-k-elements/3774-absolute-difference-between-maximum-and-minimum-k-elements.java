class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int smallestSum = 0;
        int largestSum = 0;

        for(int i=0;i<k;i++){
            smallestSum += nums[i];
        }

       int j = 0;
       int l = nums.length - 1;
       while(j<k){
        largestSum += nums[l--];
        j++;
       }

       return Math.abs(largestSum - smallestSum);
    }
}