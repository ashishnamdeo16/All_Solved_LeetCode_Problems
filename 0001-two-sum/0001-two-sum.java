class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                res[0] = i;
                res[1] = map.get(sum);
            }

            map.put(nums[i],i);
        }  

        // for(int i=0;i<nums.length;i++){
        //     for(int j =i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             res[0] = i;
        //             res[1] = j;
        //         }
        //     }
        // }

        return res;
    }
}

