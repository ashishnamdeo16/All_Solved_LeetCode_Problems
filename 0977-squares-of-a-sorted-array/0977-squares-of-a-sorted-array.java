class Solution {
    public int[] sortedSquares(int[] nums) {
      int l = 0;
      int r = nums.length - 1;
      int j = r;

      int[] arr = new int[nums.length];

      while(l<=r){
        int sqL = nums[l] * nums[l];
        int sqR = nums[r] * nums[r];

        if(sqL > sqR){
            arr[j--] = sqL;
            l++;
        }else{
            arr[j--] = sqR;
            r--;
        }
      }

      return arr;
  }
}