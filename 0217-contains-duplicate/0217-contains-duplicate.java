class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    //   HashSet<Integer> set = new HashSet<>();
    //   for(int x :nums){
    //     if(set.contains(x)){
    //         return true;
    //     }
    //     set.add(x);
    //   }
    //   return false;
    }
}