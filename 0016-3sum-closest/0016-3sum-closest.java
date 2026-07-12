class Solution {  
    public int threeSumClosest(int[] nums, int target) {
        int maxDiff = Integer.MAX_VALUE;
        int resSum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[l] + nums[r] + nums[i];
                int diff = Math.abs(sum - target);
            
                if(sum == target){
                    return target;
                }else if(sum > target){
                     if(maxDiff > diff){
                        maxDiff = diff;
                        resSum = sum;
                }
                    r--;
                    
                }else{
                     if(maxDiff > diff){
                        maxDiff = diff;
                        resSum = sum;
                }
                    l++;
                }
            } 
        }

        return resSum;
    }   
}