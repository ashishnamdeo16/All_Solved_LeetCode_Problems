class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum = 0;
       int left = 0;
       int right = 0;
       int res = Integer.MAX_VALUE;
       while(right < nums.length){
        sum += nums[right];
        while(sum >= target){
            res = Math.min(right - left + 1,res);
            sum -= nums[left];
            left++;
        }
        right++;
       }
       return res == Integer.MAX_VALUE ? 0 : res;
    } 
}