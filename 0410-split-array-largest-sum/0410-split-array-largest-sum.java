class Solution {
    public int splitArray(int[] nums, int k) {
       int j = 0;
       int low = Integer.MIN_VALUE;
       int high = 0;
       int res = -1;
       while(j<nums.length){
        low = Math.max(low,nums[j]);
        high += nums[j];
        j++;
       }
       
       while(low <= high){
        int ans = low + (high - low)/2;
        boolean isPossible = findisPossible(nums,ans,k);
        if(isPossible){
            res= ans;
            high = ans - 1;
        }else{
            low = ans + 1;
        }
       }
       return res;
    }

    public boolean findisPossible(int[] nums,int ans,int givenk){
        int k = 1;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] + sum <= ans){
                sum += nums[i];
            }else{
                k++;
                sum = nums[i];
                if(k > givenk){
                    return false;
                }
            }
        }
        return true;
    }
}