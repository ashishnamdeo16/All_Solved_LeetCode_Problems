class Solution {
    public int longestOnes(int[] nums, int k) {
       int count = 0;
       int left = 0;
       int right = 0;
       int res = Integer.MIN_VALUE;
       while(right < nums.length){
        if(count <= k && nums[right] == 0){
            count++;
        }
        while(count > k){
            if(nums[left] == 0){
                count--;
            }
            left++;
        }
        res = Math.max(res,right - left + 1);
        right++;
       }
       return res;
    }
}