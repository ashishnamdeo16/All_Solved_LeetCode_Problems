class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        if(k == nums.length){
            for(int l=0;l<nums.length;l++){
                sum += nums[l];
            }
            return (double)sum/k;
        }else{
            while(j<nums.length){
            sum += nums[j];
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                maxAvg = Math.max(maxAvg,(double)sum/k);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return maxAvg;
        }
    }
}