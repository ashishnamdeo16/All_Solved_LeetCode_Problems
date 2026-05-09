class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int left = 0;
       int right = 0;
       int res = 0;
       while(right < nums.length){
          if (nums[right] == 0) {
                left = right + 1;
            } else {
                res = Math.max(res, right - left + 1);
            }
          right++;
       }
       return res;
    }   
}