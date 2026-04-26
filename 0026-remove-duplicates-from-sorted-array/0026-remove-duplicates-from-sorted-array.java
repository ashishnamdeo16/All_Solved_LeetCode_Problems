class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;

        while(l < nums.length ){
            if(l>0 && nums[l] == nums[l-1]){
                l++;
                continue;
            }
            nums[r++] = nums[l++];
        }

        return r;
    }
}