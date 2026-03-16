class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstIndex(nums,target);
        int last =  findLastIndex(nums,target);
        return new int[]{first,last};
    }
    public int findFirstIndex(int[] nums, int target){
        int high = nums.length-1;
        int low = 0;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }
            if(nums[mid] < target){
                low = mid +1;
            }else if(nums[mid] > target){
                high = mid -1;
            }
        }
        return res;
    }
    public int findLastIndex(int[] nums, int target){
        int high = nums.length-1;
        int low = 0;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            }
            if(nums[mid] < target){
                low = mid +1;
            }else if(nums[mid] > target){
                high = mid -1;
            }
        }
        return res;
    }
}