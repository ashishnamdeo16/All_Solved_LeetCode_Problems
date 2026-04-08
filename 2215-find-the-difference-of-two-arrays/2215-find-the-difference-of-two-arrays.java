class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalAns = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }

        Set<Integer> only1 = new HashSet<>(set1);
        only1.removeAll(set2);

        Set<Integer> only2 = new HashSet<>(set2);
        only2.removeAll(set1); 

        finalAns.add(new ArrayList<>(only1));
        finalAns.add(new ArrayList<>(only2));
        return finalAns;
        
    }
}