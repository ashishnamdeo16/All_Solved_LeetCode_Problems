class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length]; 

       int prefix = 1;
       int postfix = 1;

       for(int i=0;i<nums.length;i++){
           result[i] = prefix;
           prefix *= nums[i];
       }

       for(int j=nums.length-1;j>=0;j--){
           result[j] *= postfix;
           postfix *= nums[j];
       }

    //Brute Force 
    //    for(int i=0;i<nums.length;i++){
    //       int product = 1;
    //         for(int j=0;j<nums.length;j++){
    //             if(j == i){
    //                 continue;
    //             }
    //             product *= nums[j];
    //         }
    //         result[i]=product;
    //         product=1;
    //    }
       return result;
    }
}