class Solution {
    public int longestOnes(int[] nums, int k) {
       int longest = -1;
       int l = 0 ;
       int r = 0;
       int zeroCount = 0;
       int oneCount = 0;

      while(r < nums.length){
        if(nums[r] == 1) {
            oneCount++;
        }else{
            zeroCount++;
        }

        while(zeroCount > k){
            if(nums[l] == 1) {
                oneCount--;
            }else{
                zeroCount--;
            }
            l++;
        }

        longest = Math.max(r - l + 1,longest);
        r++;
      }  

      return longest;
    }
}