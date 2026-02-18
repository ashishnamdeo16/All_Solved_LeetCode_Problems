class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSum = -1;
        int l=0;
        int r = nums.length-1;
        while(l<r){
            int sum = nums[l] + nums[r];
           if(sum >= k){
                r--;
            }else if(sum < k){
                maxSum = Math.max(sum,maxSum);
                l++;
            }
        }
        return maxSum;
    }
}