class Solution {
    public int findKthPositive(int[] arr, int k) {
       //Brute Force
       int prev =0;
        for(int i=0;i<arr.length;i++){
            int gap = arr[i] - prev -1;
            if(k<=gap){
                return prev+k;
            }
            k -= gap;
            prev = arr[i];
        }
        return prev+k;
    }
}