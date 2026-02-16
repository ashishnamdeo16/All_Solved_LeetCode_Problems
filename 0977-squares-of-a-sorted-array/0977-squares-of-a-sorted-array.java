class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0 ;
        int r = nums.length - 1;
        while(l<=r){
            if(l == r){
                nums[l] = nums[l] * nums[l];
            }else{
                nums[l] = nums[l] * nums[l];
                nums[r] = nums[r] * nums[r];
            }
            l++;
            r--;
        }

        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        Arrays.sort(nums);
        return nums;
 }
}