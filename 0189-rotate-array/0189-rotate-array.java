class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int[] temp = new int[k];

        //Copying the last elemests
        for(int i=0;i<k;i++){
            temp[i] = nums[n-k+i];
        }

        //Shifting the remaining array
        for(int j=n - k - 1;j>=0;j--){
             nums[j+k] = nums[j];
        }
        
        //joining both the arrays 
        for(int m=0;m<k;m++){
            nums[m] = temp[m];
        }
    }
}