class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int x : nums){
            if(arr.contains(x)){
                return x;
            }
            arr.add(x);
        }
        return -1;
    }
}