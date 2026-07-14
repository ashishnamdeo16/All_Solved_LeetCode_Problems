class Solution {
    public int findMaxK(int[] nums) {
    
      int largest = -1;  
      for(int i=0;i<nums.length;i++){
        if(nums[i] < 0) continue;
                    for(int j=0;j<nums.length;j++){
                        if(nums[i] == (-1) * nums[j]){
                            if(largest < nums[i]){
                                largest = nums[i];
                            }
                        }
                    }
            }
      return largest;
    }
}
