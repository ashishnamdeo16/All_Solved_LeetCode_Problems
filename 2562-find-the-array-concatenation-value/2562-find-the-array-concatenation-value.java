class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long val = 0;
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            if(l != r){
                 String con = nums[l] + "" + nums[r];
                 val += Integer.parseInt(con);
            }else{
                val += nums[l];
            }
            l++;
            r--;
        }
        return val;
    }
}