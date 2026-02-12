class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int minValue = -1;
        for(int x : nums1){
            set.add(x);
        }

        for(int k : nums2){
            if(set.contains(k)){
                return k;
            }
        }
        return minValue;
    }
}