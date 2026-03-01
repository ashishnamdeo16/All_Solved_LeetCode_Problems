class Solution {
    public int pivotIndex(int[] nums) {
      int left = 0;
      int right = 0;
      int sum = 0;
      for(int x : nums){
        sum += x;
      }
      for(int i=0;i<nums.length;i++){
        right = sum - left - nums[i];
        if(left == right){
            return i;
        }
        left += nums[i];
      }
      return -1;
    }
}