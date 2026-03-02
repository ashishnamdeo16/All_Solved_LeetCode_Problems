class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Optimized Solution
        Map<Integer,Integer> bucket = new HashMap<>();
        int i=0;
        while(i<nums.length){
            int num2 = target - nums[i];
            if(bucket.containsKey(num2)){
                return new int[]{i,bucket.get(num2)};
            }
            bucket.put(nums[i],i);
            i++;
        }

        // //Brute Force
        // int sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        return new int[]{-1,-1};
    }
}