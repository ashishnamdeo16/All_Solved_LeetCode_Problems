class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while(m <= r){
            if(nums[m] == 0){
                int temp = nums[l];
                nums[l++] = nums[m];
                nums[m++] = temp;
            }else if(nums[m] == 2){
                int temp = nums[r];
                nums[r--] = nums[m];
                nums[m] = temp;
            }else{
                m++;
            }
        }

    }
}