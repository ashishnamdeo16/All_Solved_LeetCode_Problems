class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right =0;
        int i =0;
        int[] merged = new int[m+ n];

        while(left < m && right < n){
            if(nums1[left] < nums2[right]){
                merged[i++] = nums1[left];
                left++;
            }else{
                merged[i++] = nums2[right];
                right++;
            }
        }

        while(left < m){
            merged[i++] = nums1[left];
            left++;
        }

        while(right < n){
            merged[i++] = nums2[right];
            right++;
        }

        for(int k=0;k<m+n;k++){
            nums1[k] = merged[k];
        }

    }
}