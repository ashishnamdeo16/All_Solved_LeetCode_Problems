class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i =0;
        Set<Integer> newSet = new HashSet<>();
        Set<Integer> newSet2 = new HashSet<>();
        while(i<nums1.length){
            newSet.add(nums1[i]);
            i++;
        }
        int j =0;
        while(j<nums2.length){
            if(newSet.contains(nums2[j])){
                newSet2.add(nums2[j]);
            }
            j++;
        }
        int[] arr = newSet2.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}