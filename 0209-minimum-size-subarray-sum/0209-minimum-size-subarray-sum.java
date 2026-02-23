class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int low = 0;
    int high = 0;
    int minLen = Integer.MAX_VALUE;
    int sum = 0;
    while(high<nums.length){
        sum += nums[high];
        while(sum >= target){
            int len = high - low + 1;
            minLen = Math.min(len,minLen);
            sum -= nums[low];
            low++;
        }
        high++;
    }

    return minLen == Integer.MAX_VALUE ? 0 : minLen;
    } 
}