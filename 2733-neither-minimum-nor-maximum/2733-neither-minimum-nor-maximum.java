class Solution {
    public int findNonMinOrMax(int[] nums) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }

        for(int x : nums){
            if(x != min && x != max){
                ans = x;
                break;
            }
        }

        return ans;
    }
}