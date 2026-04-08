class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalAns = new ArrayList<>();
        Set<Integer> setq = new HashSet<>();
        Set<Integer> setp = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        for(int x : nums1){
            if(!set2.contains(x)){
                setq.add(x);
            }
        }
        for(int x : nums2){
            if(!set1.contains(x)){
                setp.add(x);
            }
        }
        List<Integer> temp1 = new ArrayList<>(setq);
        List<Integer> temp2 = new ArrayList<>(setp);
        finalAns.add(temp1);
        finalAns.add(temp2);
        return finalAns;
        
    }
}