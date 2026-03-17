class Solution {
    public int search(int[] nums, int target) {
    int min = findMinIndex(nums);
    if(min == -1) return -1;
  
    int right = binarySearch(min,nums.length-1,nums,target);
    if(right != -1){
        return right;
    }
    
    return binarySearch(0,min-1,nums,target);
   }


   public int binarySearch(int low,int high,int[] nums,int target){
    int res = -1;
    while(low<=high){
        int mid = low + (high - low )/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            high = mid-1;
        }else {
            low = mid +1;
        }
    }
    return -1;
   }

   public int findMinIndex(int[] nums){
    int low = 0;
    int high = nums.length-1;
    int res = -1;
    while(low <= high){
        int mid = low + (high - low )/2;
        if(nums[mid] > nums[nums.length-1]){
            low = mid +1;
        }else{
            res = mid;
            high = mid -1;
        }
    }
    return res;
   }
}
   

