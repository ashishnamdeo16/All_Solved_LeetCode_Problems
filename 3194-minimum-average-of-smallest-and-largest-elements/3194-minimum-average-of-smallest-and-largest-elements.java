class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int l = 0 ;
        int r = nums.length - 1;

        double res = Double.MAX_VALUE;

        while(l < r){
            double avg = (double) (nums[l] + nums[r]) / 2;
            res = Math.min(avg,res);
            l++;
            r--;
        }    

        return res;
    }
}