class Solution {  
    public int threeSumClosest(int[] nums, int target) {
        int smallestDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[l] + nums[r] + nums[i];
                int diff = Math.abs(sum - target);
                if(diff < smallestDiff){
                    smallestDiff = diff;
                    closestSum = sum;
                }
                if(sum == target){
                  l++;
                  r--;
                }else if(sum > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return closestSum;
    }   
}