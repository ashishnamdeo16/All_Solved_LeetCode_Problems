class Solution {
    public int maximumCandies(int[] candies, long k) {
        int res = 0;
        int low = 1;
        int high = findMax(candies);
        while(low <=high ){
            int mid = low + (high - low)/2;
            boolean isPossible = findpossiblity(candies, mid, k);
            if(isPossible){
                res = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return res;
    }
    public int findMax(int[] candies){
        int max = Integer.MIN_VALUE;
        for(int x : candies){
            max = Math.max(x,max);
        }
        return max;
    }
    public boolean findpossiblity(int[] candies,int mid,long k){
        long count = 0;
        for(int x : candies){
            count += x / mid;
            if(count >= k){
                return true;
            }
        }
        return false;
    }
}