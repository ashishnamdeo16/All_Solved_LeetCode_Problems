class Solution {
    public void moveZeroes(int[] nums) {
        // int count = 0;
        // int l = 0;
        // for(int x : nums){
        //     if(x == 0){
        //         count++;
        //     }else{
        //         nums[l++] = x;
        //     }
        //     }
        
        // while(l<nums.length){
        //     nums[l] = 0;
        //     l++;
        // }

        int r = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp =  nums[r];
                nums[r++] = nums[i];
                nums[i] = temp;
            }
        }
      
    }
}