class Solution {
        int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;
        findSumWays(nums,n,sum,target,0);
        return count;
    }
    public void findSumWays(int[] nums,int n,int sum,int target,int i){
        if(i == n){
            if(sum == target){
                count++;
            }
            return;
        }
        sum += (-1) * nums[i];
        findSumWays(nums,n,sum,target,i + 1);
        sum -= (-1) * nums[i];

        sum += nums[i];
        findSumWays(nums,n,sum,target,i + 1);
        sum -= nums[i];

        return;
    }
}