class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negCount = 0;
        for(int x:nums){
            if(x > 0){
                positiveCount++;
            }else if(x < 0){
                negCount++;
            }
        }
        return Math.max(positiveCount,negCount);
    }
}
