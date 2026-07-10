class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }

        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            while(n>0){
                int rem = n%10;
                digitSum += rem;
                n /= 10;
            }
        }

        return Math.abs(sum - digitSum);
    }
}