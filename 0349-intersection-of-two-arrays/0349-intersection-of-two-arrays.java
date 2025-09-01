class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i =0;
        int k=0;
        Set<Integer> newSet = new HashSet<>();
        while(i<nums1.length){
            int h=0;
            while(h<nums2.length){
                if(nums2[h] == nums1[i]){
                     newSet.add(nums1[i]);
                }
                h++;
            }
            i++;
        }
        int j =0;
        while(j<nums2.length){
             int h=0;
            while(h<nums1.length){
                if(nums1[h] == nums2[j]){
                       newSet.add(nums2[j]);
                       }
                h++;
            }
            j++;
        }
        int[] arr = newSet.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}