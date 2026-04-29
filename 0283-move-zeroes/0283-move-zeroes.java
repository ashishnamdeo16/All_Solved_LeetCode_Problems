class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length -1;
        while(mid <= right){
            if(nums[mid] != 0){
                int temp = nums[left];
                nums[left++] = nums[mid];
                nums[mid] = temp;
            }
            mid++;
        }
        // int pos = 0;
        // for(int n:nums){
        //     if(n != 0){
        //         nums[pos++] = n;
        //     }
        // }
        // while(pos<nums.length){
        //     nums[pos++] = 0;
        // }
    
    }
}