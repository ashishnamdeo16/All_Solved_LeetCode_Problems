class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left = 0;
      int right = 0;
      int sum = 0;
      int len = Integer.MAX_VALUE;

      while(right < nums.length){
        sum += nums[right];
        if(sum  < target){
            right++;
        }else{
            while(sum >= target){
                sum -= nums[left];
                len = Math.min(len,right - left + 1);
                left++;
            }
        right++;
        }
      }

      return len == Integer.MAX_VALUE ? 0 : len;
    } 
}