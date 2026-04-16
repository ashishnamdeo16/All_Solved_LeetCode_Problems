class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;

        for(int i =l;i<=r;i++){
            int sum =0;
            int left = 0;
            int right = 0;

            while(right < nums.size()){
                sum += nums.get(right);
                if(right - left + 1 < i){
                    right++;
                }else if(right - left +1 == i){
                    if(sum > 0){
                        res = Math.min(sum,res);
                    }
                    sum -= nums.get(left);
                    left++;
                    right++;
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}