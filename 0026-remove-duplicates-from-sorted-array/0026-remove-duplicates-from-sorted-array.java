class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 1;
        if (nums.length == 0) return 0;
        for(int i=1;i<nums.length;i++)
            if(nums[i] != nums[i-1]){
                nums[len] = nums[i];
                len++;
            }
             return len;
        }
    }