class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int sum = target - nums[i];
        if(map.containsKey(sum)){
            return new int[]{map.get(sum),i};
        }
        map.put(nums[i],i);
       }

       return new int[]{-1,-1};
    }
}

// sum = 9 - 2 = 7
// map.add(2,1);
// sum = 9 - 7 = 2
// map.contains(2) --> 0,1
