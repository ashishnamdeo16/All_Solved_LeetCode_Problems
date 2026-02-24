class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxZero = 0;
        int maxOne = 0;
        int low =0;
        int high =0;
        int res = Integer.MIN_VALUE;
        while(high<nums.length){
            if(nums[high] == 1){
                maxOne++;
            }else{
                maxZero++;
            }
            int len = high - low +1;

            while(maxZero > k){
                  if(nums[low] == 0){
                     maxZero--;
                 }else{
                    maxOne--;
                 }
                 low++;
            }

            len = high - low + 1;
            res = Math.max(len,res);
            high++;
        }
        return res;
    }
}