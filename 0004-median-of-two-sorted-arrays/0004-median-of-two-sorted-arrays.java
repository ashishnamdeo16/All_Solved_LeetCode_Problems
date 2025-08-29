class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int len = nums1.length+nums2.length;
     int[] arr = new int[len];
     int i=0;int j=0;int k=0;
        while(i<nums1.length && j <nums2.length){
           if(nums1[i] < nums2[j]){
             arr[k++] = nums1[i++];
           }else {
             arr[k++] = nums2[j++];
           }
        }
        while(i<nums1.length) arr[k++] = nums1[i++];
        while(j<nums2.length) arr[k++] = nums2[j++];

        if(len%2 == 0){
            return (arr[len/2-1]+arr[len/2])/2.0;
        }else{
            return arr[len/2];
        }
    }
}