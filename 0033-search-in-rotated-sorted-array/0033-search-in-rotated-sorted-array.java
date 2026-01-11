class Solution {
    public int search(int[] nums, int target) {
    int minIndex = minIndex(nums);
    int l = 0;
    int r = nums.length-1;
    int mid = l+(r-l)/2;
    if(target == nums[mid]) return mid;
    int res = binarySearch(l,minIndex-1,nums,target);
    int res2 = binarySearch(minIndex,r,nums,target);

    if(res != -1){
        return res;
    }

    return res2;
    }       

    public int binarySearch(int l,int r,int[] nums,int target){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid-1;
            }else if(nums[mid] < target){
                l = mid+1;
            }
        }
        return -1;
    }

    public int minIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%nums.length;
            int prev = (mid+nums.length-1)% nums.length;
            if(nums[start] <= nums[end]){
                return start;
            }
            if(nums[next] >= nums[mid] && nums[prev] >= nums[mid]){
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
        
 //Optimized Approach
        // int minIndex = minIndex(nums);
        // int res = binarySearch(nums,target,0,minIndex-1);
        // int res2 = binarySearch(nums,target,minIndex,nums.length-1);
        // if (res != -1)
        //     return res;
        // else
        //    return res2;
        //Brute Force Approach
        // int isPresent = -1;
        // for(int i=0;i<nums.length;i++){
        // if(nums[i] == target){
        //     isPresent = i;
        // }
        // }
        // return isPresent ;
    // }
    //  private static int binarySearch(int[] nums,int target,int start,int end){
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(nums[mid] == target){
    //             return mid;
    //         }
    //         if(nums[mid] < target){
    //             start = mid+1;
    //         }else{
    //             end = mid-1;
    //         }
    //     }
    //   return -1;
    // }

    // public static int minIndex(int[] nums){
    //     int start=0;
    //     int end=nums.length-1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         int next = (mid+1)%nums.length;
    //         int prev = (mid+nums.length-1) % nums.length;
    //         if(nums[start] <= nums[end]){
    //             return start;
    //         }
    //         if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
    //                 return mid;
    //         }
    //         if(nums[start] <= nums[mid]){
    //             start = mid+1;
    //         }else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
