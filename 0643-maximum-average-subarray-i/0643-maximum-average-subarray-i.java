class Solution {
    public double findMaxAverage(int[] nums, int k) {
    //Intializing the pointers and variables    
    int l=0;
    int r=0;
    int sum = 0;
    double maxAvg = Double.NEGATIVE_INFINITY;   

    //Starting the Conditions for Edge Case
    if(k == nums.length){
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return (double)(sum/k);
    }else{
        //Actual Loop for Fixing the Window
        while(r<nums.length){
            sum += nums[r];
            //Condition which will increament the pointer till window size is not Fixed
            if(r-l+1 < k){
                r++;
            }else if(r-l+1 == k){
                //Window is fixed for k size
                maxAvg = Math.max((double)sum/k,maxAvg);
                sum -= nums[l];
                l++;
                r++;
            }
        }
        return maxAvg;
    }
    }
}