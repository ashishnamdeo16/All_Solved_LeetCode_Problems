class Solution {
    public int singleNonDuplicate(int[] nums) {
    //Optimized Approach 
    int res=0;
    for(int i:nums){
        res ^= i;
    }
    return res;

    //  Brute Force Approach   
    // int i=0;
    //    while(i<nums.length){
    //         int count =0;
    //         for(int j =i+1;j<nums.length;j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //         }
    //         if(count == 0){
    //             return nums[i];
    //         }else if(count < 3){
    //             i = i+2;
    //         }
    //    }
    //    return -1;
    }
}