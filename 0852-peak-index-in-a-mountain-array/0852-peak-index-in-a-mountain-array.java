class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int high = arr.length;
        int low = 0;
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }else if(arr[mid] > arr[mid+1]){
                res = mid;
                high = mid -1;
            }
        }
        return res;
    }
}