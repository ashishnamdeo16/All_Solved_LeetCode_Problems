class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        int num=0;
        for(int i=0;i<=nums.length;i++){
            if(!treeSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}