class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int j=0;
        int totalWeight = 0;
        int maxWeight = 0;
        while(j<weights.length){
            maxWeight = Math.max(maxWeight,weights[j]);
            totalWeight += weights[j];
            j++;
        }

        int start =maxWeight;
        int end=totalWeight;
        int ans = totalWeight;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(CanShip(weights,mid,days)){
                ans = mid;
                end=mid-1;
            }else {
                start = mid+1;
            }
        }

        return ans;
    }

    public static boolean CanShip(int[] weights,int capacity,int days){
        int curr = 0;
        int day=1;
        for(int val: weights){
            if(curr + val > capacity ){
                curr =0;
                day++;
            }
            curr += val;
        }

    return day <= days;
    }
}