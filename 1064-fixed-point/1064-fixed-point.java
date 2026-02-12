class Solution {
    public int fixedPoint(int[] arr) {
        int min = -1;
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == mid){
                min = mid;
                r = mid - 1 ;
            }else if(arr[mid] > mid){
                r = mid-1;
            }else if(arr[mid] < mid){
                l = mid + 1;
            }
        }
        return min;
    }
}