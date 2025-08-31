class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<nums.length){
            if(nums[i] == target){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}