class Solution {
    public void sortColors(int[] nums) {
       for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
         int l = i+1;
         while(l < nums.length){
            if(nums[i] > nums[l]){
                swap(i,l,nums);   
            }
                l++;
         }
       }
    }
    public void swap(int x,int y,int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp ;
    }
}