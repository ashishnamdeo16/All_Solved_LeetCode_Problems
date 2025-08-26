class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstOccurence = firstOccurance(nums,target);
        int lastOccurence = lastOccurance(nums,target);
        return new int[]{firstOccurence,lastOccurence};
    }
    public int firstOccurance(int[] nums,int target){
        int start = 0; int end = nums.length-1;
        int firstOccurence = -1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                firstOccurence = mid;
                end =mid-1;
            }else if(nums[mid] < target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return firstOccurence;
    }
    public int lastOccurance(int[] nums,int target){
         int start = 0; int end = nums.length-1;
        int lastOccurence = -1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                lastOccurence = mid;
                start =mid+1;
            }else if(nums[mid] < target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return lastOccurence;
    }
}