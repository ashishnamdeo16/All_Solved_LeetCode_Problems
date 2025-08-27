class Solution {
    public int search(int[] nums, int target) {
        int pivot = SearchPivot(nums);
        int res = binarySearch(nums,target,0,pivot-1);
        int res2 = binarySearch(nums,target,pivot,nums.length-1);
        if (res != -1)
            return res;
        else
           return res2;
    }
    private static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
      return -1;
    }
    private static int SearchPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%nums.length;
            int prev = (mid+nums.length-1) % nums.length;
            if(nums[start] <= nums[end]){
                return start;
            }
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                    return mid;
            }
            if(nums[start] <= nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}