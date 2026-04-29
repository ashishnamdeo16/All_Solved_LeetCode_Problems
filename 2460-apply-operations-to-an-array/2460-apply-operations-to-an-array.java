class Solution {
    public int[] applyOperations(int[] nums) {
        int l = 1;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0; 
            }
        }
        

        int[] arr = new int[nums.length];
        int r = 0;
        int count = 0;

        for(int x : nums){
            if(x == 0){
                count++;
            }else{
                arr[r++] = x;
            }
        }

        return arr;
    }
}