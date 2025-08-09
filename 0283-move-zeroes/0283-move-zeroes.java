class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1] = nums[j];
                }
            }
        }
        for(int j=nums.length-count;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}