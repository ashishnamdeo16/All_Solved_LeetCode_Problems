class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right =0;
        int left = 0;
        int res = Integer.MIN_VALUE;
        int count = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                count++;
            }

            while(count > 1){
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