class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int missing = -1;
        int duplicate = -1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
               duplicate = nums[i];
            }
            set.add(nums[i]);
        } 

        for(int j=1;j<=nums.length;j++){
            if(!set.contains(j)){
              missing = j;
              break;
            }  
        }

        return new int[]{duplicate,missing};
    }
}