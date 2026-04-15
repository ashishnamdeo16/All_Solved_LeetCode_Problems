class Solution {
    public int minAbsoluteDifference(int[] nums) {
         int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if( (nums[i] == 1 && nums[j] == 2) || (nums[i] == 2 && nums[j] == 1)){
                   res = Math.min(res,Math.abs(i-j));
                }
            }
        }
         return res != Integer.MAX_VALUE ? res : -1;
    }
}