class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> finalSet = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x : nums1){
            set.add(x);
        }

        for(int x : nums2){
            if(set.contains(x)){
                finalSet.add(x);
            }
            set2.add(x);
        }

        for(int x : nums3){
            if(set.contains(x) || set2.contains(x)){
                finalSet.add(x);
            }
        }

        List<Integer> arr = new ArrayList<>();

        for(int x : finalSet){
            arr.add(x);
        }

        return arr;
    }
}