class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int prevSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                sum += nums[i];
                if(sum>prevSum){
                    prevSum = sum;
                }
            }else{
                sum =0;
            }
        }
        if(prevSum > sum){
                return prevSum;
        }
        return sum;
    }   
}