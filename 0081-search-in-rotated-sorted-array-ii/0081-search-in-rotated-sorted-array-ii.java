class Solution {
    public boolean search(int[] nums, int target) {
        //Brute Force Solution
        int i = 0;
        while(i<nums.length){
            if(nums[i] == target){
                return true;
            }
            i++;
        }
        return false;
    }
}