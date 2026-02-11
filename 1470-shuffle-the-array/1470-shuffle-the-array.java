class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[2*n];
        for(int i=0,k=0,j=n;i<2*n;i=i+2,j++,k++){
            temp[i] = nums[k];
            temp[i+1] = nums[j];
        };
        return temp;
    }
}