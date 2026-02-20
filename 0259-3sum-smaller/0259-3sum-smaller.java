class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum < target){
                    count = count + (r-l);
                    l++;
                }else if(sum >= target){
                    r--;
                }
            }
        }
        return count;
    }
}