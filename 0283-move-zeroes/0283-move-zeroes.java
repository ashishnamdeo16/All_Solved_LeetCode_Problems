class Solution {
    public void moveZeroes(int[] nums) {

        int l = 0;
        int r = 0;
        while(r <= nums.length-1){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l++] = nums[r];
                nums[r] = temp;
            }
            r++;
        }   


    //    int l =0;

    //    for(int i=0;i<nums.length;i++){
    //       if(nums[i] != 0){
    //             nums[l++] = nums[i];
    //         }
    //    }

    //    while(l<nums.length){
    //     nums[l++] = 0;
    //    }
    }
}