class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
       int low = 1;
       int high = findMax(bloomDay);
       int res = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int noOfB = findNoOfB(bloomDay,mid,k);
            if(noOfB < m){
                low = mid+1;
            }else {
                res = mid;
                high = mid-1;
            }
        }
        return res;
    }
    public int findMax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        for(int x : bloomDay){
            max = Math.max(x,max);
        }
        return max;
    }
    public int findNoOfB(int[] bloomDay,int mid,int k){
        int count = 0;
        int res = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                count = 0;
                continue;
            }
            if(count == k){
                res++;
                count = 0;
            }
        }
        return res;
    }
}