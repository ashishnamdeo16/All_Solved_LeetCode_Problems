class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length -1;
      while(l <= r){
         if(nums[l] <= 0){
            int num = (-1) * nums[l];
            nums[l] = nums[l] * nums[l];
            l++;
         }else if(nums[r] > 0){
            nums[r] = nums[r] * nums[r];
            r--;
          }
      }

      Arrays.sort(nums);
      return nums;
 }
}