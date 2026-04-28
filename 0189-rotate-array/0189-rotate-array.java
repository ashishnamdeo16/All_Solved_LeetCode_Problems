class Solution {
    public void rotate(int[] nums, int k) {
       int kk = k % nums.length;
       if (kk == 0) return; 

       int[] arr1 = new int[kk];
       int[] arr2 = new int[nums.length - kk];

       int l = 0;
       for(int i=nums.length - kk;i<nums.length;i++){
           arr1[l++] = nums[i];
       }

       for(int i=0;i<nums.length  - kk;i++){
        arr2[i] = nums[i];
       }

       int i =0; 
       while(i < arr1.length){
          nums[i] = arr1[i];
          i++;
       }

        int j = 0;
        while(j < arr2.length){
          nums[i] = arr2[j++];
          i++;
       }
    }
}