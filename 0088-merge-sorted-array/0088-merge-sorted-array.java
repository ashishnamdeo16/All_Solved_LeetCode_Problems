class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int j = 0;
        int i = 0;
        int[] merged = new int[nums1.length];
        while(l < m && j < n){
            if(nums1[l] > nums2[j]){
                merged[i++] = nums2[j];
                j++;
            }else if(nums1[l] <= nums2[j]){
                merged[i++] = nums1[l];
                l++;
            }
        }

        while(j<n){
                merged[i++] = nums2[j];
                j++;
        }

        while(l<m){
                merged[i++] = nums1[l];
                l++;
        }

        for (int k = 0; k < m + n; k++) nums1[k] = merged[k];


    //   Brute Force
    //     int l=0;
    //     for(int i=0;i<m+n;i++){
    //      if(i >= m){
    //          nums1[i] = nums2[l];
    //          l++;
    //      }
    //    }
    //    Arrays.sort(nums1);
    // return merged;
    }
}