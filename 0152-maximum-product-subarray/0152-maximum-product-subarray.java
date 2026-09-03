class Solution {
    public int maxProduct(int[] nums) {
     int minEnd = nums[0];
     int maxEnd = nums[0];
     int res = nums[0];

     for(int i=1;i<nums.length;i++){
        int v1 = nums[i];
        int v2 = nums[i] * minEnd;
        int v3 = nums[i] * maxEnd;
        minEnd = Math.min(v1,Math.min(v2,v3));
        maxEnd = Math.max(v1,Math.max(v2,v3));
        res = Math.max(res,maxEnd);
     }

     return res;
    }
}