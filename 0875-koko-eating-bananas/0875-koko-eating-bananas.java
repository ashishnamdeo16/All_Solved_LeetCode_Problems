class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = maxOfPiles(piles);
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            long hr = findNoOfHours(piles,mid);
            if(hr > h){
                low = mid+1;
            }else{
                res = mid;
                high = mid -1; 
            }
        }
        return res;
    }

    public int maxOfPiles(int[] piles){
        int res = Integer.MIN_VALUE;
        for(int i =0;i<piles.length;i++){
            res = Math.max(res,piles[i]);
        }
        return res;
    }

    public long findNoOfHours(int[] piles,int mid){
        long h = 0;
        for(int i=0;i<piles.length;i++){
            h = h + piles[i]/mid;
            if(piles[i] % mid != 0){
                h++;
            }
        }
        return h;
    }
}